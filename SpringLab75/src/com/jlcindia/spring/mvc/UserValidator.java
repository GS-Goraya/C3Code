package com.jlcindia.spring.mvc;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User.class.equals("class");
	}

	@Override
	public void validate(Object command, Errors errors) {
	User user=(User)command;
	if(user.getUsername()==null||user.getUsername().length()==0) {
		errors.rejectValue("username","error.username.reqiured",null,"username required.");		
	}
	if(user.getPassword()==null||user.getPassword().length()==0)
	{
		errors.rejectValue("password","errors.password.required",null,"password reuired.");
	}
	}

	
}
