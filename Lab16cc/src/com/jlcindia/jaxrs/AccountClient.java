package com.jlcindia.jaxrs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class AccountClient
{

	public static void main (String[] args)
	{
	
	ClientConfig config=new DefaultClientConfig();
	Client client=Client.create(config);
	String url1="http://localhost:8888/Lab16ss/services/account/getbal/101";
	WebResource webres=client.resource(url1);
	Account acc=webres.get(Account.class);
	System.out.println("Balance:"+acc.getBalance());
	System.out.println();
	String url2="http://localhost:8888/Lab16ss/services/account/deposit/102/5000";
	WebResource webres2=client.resource(url2);
	String msg=webres2.get(String.class);
	System.out.println(msg);
	System.out.println();
	String url3="http://localhost:8888/Lab16ss/services/account/withdraw/103/5000";
	WebResource webres3=client.resource(url3);
	String msg1=webres3.get(String.class);
	System.out.println(msg1);
	System.out.println();
	
	}}