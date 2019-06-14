package com.jlcindia.spring.mvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jlcindia.spring.hibernate.Contact;
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
	protected String addContact(@ModelAttribute(value = "contact") @Valid ContactCommand contact,BindingResult result, HttpServletRequest req)
			throws Exception {
		if(result.hasErrors())
		{
			System.out.println("erross show");
			return "contact";
			
		}
		else
		{
		System.out.println("addContact");
		String name = contact.getContactName();
		String email = contact.getContactEmail();
		String phone = contact.getContactPhone();
		int contactId=contact.getContactId();
		ContactTO cto = new ContactTO();
		cto.setContactName(name);
		cto.setContactEmail(email);
		cto.setContactPhone(phone);
		cto.setContactId(contactId);

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

		return "display";
		}
		
	}
	@RequestMapping("/delete.jlc")
	protected String deleteCustomer(@RequestParam("contactId") int theId,HttpServletRequest req)
			throws Exception {
		// delete the customer
				contactService.deleteContact(theId);
				  System.out.println("delete");
				  List<ContactTO> cList = contactService.getAllContacts();
					if (cList != null && cList.size() > 0)
						req.setAttribute("CLIST", cList);
					ContactCommand contact = new ContactCommand();
					contact.setContactName("");
					contact.setContactEmail("");
					contact.setContactPhone("");
//					System.out.println("controller finish");
					System.out.println("Delete sucessfully");
					return "display";
	}

	@RequestMapping("/showFormForUpdate.jlc")
	public String showFormForUpdate(@RequestParam("contactId") int theId,ContactCommand contact,HttpServletRequest req
									) {
		// get the customer from our service
		Contact contact1 = contactService.getContact(theId);	
		// set customer as a model attribute to pre-populate the form
		req.setAttribute("contact", contact1);
		System.out.println(contact1);
		// send over to our form		
		return "contact";
	}
	
	}
	

