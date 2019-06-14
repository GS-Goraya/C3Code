package com.jlcindia.spring.dao;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.jlcindia.spring.hibernate.Contact;
import com.jlcindia.spring.to.ContactTO;

@Repository
@Transactional
public class ContactDAOImpl<ContactTo> implements ContactDAO {
	@Autowired
	HibernateTemplate hTemp;

	public boolean addContact(ContactTO cto) {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		contact.setContactName(cto.getContactName());
		contact.setContactEmail(cto.getContactEmail());
		contact.setContactPhone(cto.getContactPhone());
		contact.setContactId(cto.getContactId());
		hTemp.saveOrUpdate(contact);
		return true;

	}

	public List<ContactTO> getAllContacts() {
		List<ContactTO> cList = null;
		List<Contact> list = (List<Contact>) hTemp.find("from Contact c");
		if (list.size() > 0) {
			cList = new ArrayList<ContactTO>();
			for (Contact c : list) {
				ContactTO cto = new ContactTO();
				cto.setContactId(c.getContactId());
				cto.setContactName(c.getContactName());
				cto.setContactEmail(c.getContactEmail());
				cto.setContactPhone(c.getContactPhone());
				cList.add(cto);

			}
		}

		return cList;
	}
	@Override
	public void deleteContact(int theId) {	
		// delete object with primary key
		SessionFactory  sf=hTemp.getSessionFactory();

		// get the current hibernate session
		Session currentSession = sf.getCurrentSession();
	
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Contact where id=:contactId");
		theQuery.setParameter("contactId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public Contact getContact(int theId) {
		SessionFactory  sf=hTemp.getSessionFactory();
		// get the current hibernate session
		Session currentSession = sf.getCurrentSession();
		Contact theContact=(Contact) currentSession.get(Contact.class, theId);
		return theContact;	
	}


	}
	

