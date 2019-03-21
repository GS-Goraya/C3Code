package com.jlcindia.spring.dao;

import java.util.List;

import com.jlcindia.spring.to.ContactTO;

public interface ContactDAO {
public boolean addContact(ContactTO cto);
public List<ContactTO>getAllContacts();

}
