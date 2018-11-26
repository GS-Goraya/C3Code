package com.jlcindia.hibernate;

public class pop {

	public static void main(String[] args) {
	    try {
	        String hibernateVersion = org.hibernate.annotations.common.Version.getVersionString();
	        System.out.println("Hibernate Version: "+ hibernateVersion);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	}
