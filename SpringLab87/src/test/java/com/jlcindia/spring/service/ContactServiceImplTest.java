package com.jlcindia.spring.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import com.jlcindia.spring.dao.ContactDAO;
import com.jlcindia.spring.to.ContactTO;

public class ContactServiceImplTest {
	@Mock
	ContactDAO contactDAO;

	@Before
	public void initMocks() {

		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void addContactTest() {
		ContactTO cto = new ContactTO();
		cto.setContactName("AAA");
		cto.setContactEmail("BBB");
		cto.setContactPhone("5655");
		cto.setContactId(5);
		ContactServiceImpl cst = new ContactServiceImpl();
		Mockito.when(contactDAO.addContact(cto)).thenReturn(true);
		assertTrue(cst.addContact(cto));
		Mockito.verify(contactDAO).addContact(cto);

	}

}
