package com.jlcindia.spring.dao;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
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
		hTemp.save(contact);
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

}
