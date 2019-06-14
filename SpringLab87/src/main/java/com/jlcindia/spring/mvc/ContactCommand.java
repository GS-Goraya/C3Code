package com.jlcindia.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactCommand {
	@NotNull
	@Size(min=1, message=" * is required")
private String contactName;
private String contactEmail;
private String contactPhone;
private int contactId;
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public String getContactEmail() {
	return contactEmail;
}
public void setContactEmail(String contactEmail) {
	this.contactEmail = contactEmail;
}
public String getContactPhone() {
	return contactPhone;
}
public void setContactPhone(String contactPhone) {
	this.contactPhone = contactPhone;
	
}
public int getContactId() {
	return contactId;
}
public void setContactId(int contactId) {
	this.contactId = contactId;
}
}

