package com.jlcindia.jaxrs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class CustomerClient
{

	public static void main (String[] args)
	{
	
	ClientConfig config=new DefaultClientConfig();
	Client client=Client.create(config);
	
	// Get customer By cid
	String url1="http://localhost:8888/Lab17ss/services/customer/getbyid/101";
	WebResource webres=client.resource(url1);
	
	//A. Getting XML as Output
	String str=webres.get(String.class);
	System.out.println(str);
	
	//B. Getting Customer Object as output
	Customer cust=webres.get(Customer.class);
	System.out.println(cust);
	
	//2. get customer by city
	String url2="http://localhost:8888/Lab17ss/services/customer/getbycity/Blore";
	 webres=client.resource(url2);
	 
	 // Getting AML as OUTPUT
    str=webres.get(String.class);	
	System.out.println(str);
	
	//B. Getting Customers Object ad Output
	Customers cs=webres.get(Customers.class);
	for(Customer c: cs.getCustomer())
	{
		System.out.println(c);
	}
	
	// 3. ADD Customer
	String url3="http://localhost:8888/Lab17ss/services/customer/add";
	 webres=client.resource(url3);
	 webres.post(cust);
	
	 //4. update Customer
	 String url4="http://localhost:8888/Lab17ss/services/customer/update";
	 webres=client.resource(url4);
	 webres.put(cust);
	
	}}