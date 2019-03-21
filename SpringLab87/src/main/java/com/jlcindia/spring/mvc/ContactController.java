package com.jlcindia.spring.mvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jlcindia.spring.service.ContactService;
import com.jlcindia.spring.to.ContactTO;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;
	@RequestMapping(value = { "/showaddcontact.jlc" })
	protected String showContactPage(Map map) throws Exception {
		System.out.println("show contact page");
		ContactCommand c = new ContactCommand();
		map.put("contact", c) ;
		return "contact";
	}

	@RequestMapping(value = { "/addcontact.jlc" }, method = RequestMethod.POST)
	protected String addContact(@ModelAttribute(value = "contact") ContactCommand contact, HttpServletRequest req)
			throws Exception {
		System.out.println("addContact");
		String name = contact.getContactName();
		String email = contact.getContactEmail();
		String phone = contact.getContactPhone();

		ContactTO cto = new ContactTO();
		cto.setContactName(name);
		cto.setContactEmail(email);
		cto.setContactPhone(phone);

		boolean added = contactService.addContact(cto);
		System.out.println("added sucessfully");
		if (added) {
			req.setAttribute("MSG", "Contact added sucessfully");
			System.out.println("added sucessfully");

		} else {
			req.setAttribute("MSG", "Error while adding contact");

		}
		List<ContactTO> cList = contactService.getAllContacts();
		if (cList != null && cList.size() > 0)
			req.setAttribute("CLIST", cList);
		contact.setContactName("");
		contact.setContactEmail("");
		contact.setContactPhone("");
//		System.out.println("controller finish");
		System.out.println("added sucessfully");
		return "contact";
		

	}

}
