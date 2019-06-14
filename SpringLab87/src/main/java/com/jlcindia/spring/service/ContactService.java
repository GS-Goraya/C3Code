package com.jlcindia.spring.service;

import java.util.List;

import com.jlcindia.spring.hibernate.Contact;
import com.jlcindia.spring.to.ContactTO;
public interface ContactService {
public boolean addContact(ContactTO cto);
public List<ContactTO>getAllContacts();
public Contact getContact(int theId);
public void deleteContact(int theId);

}
