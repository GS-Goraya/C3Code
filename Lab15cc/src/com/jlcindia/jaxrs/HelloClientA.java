package com.jlcindia.jaxrs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class HelloClientA
{

//	private static final String webServiceURI = "http://localhost:8888/Lab15ss/services/hello/gm1/sss";
	public static void main (String[] args)
	{
		
		// Old code of jersy 1.19
		
	ClientConfig config=new DefaultClientConfig();
	Client client=Client.create(config);
	String url1="http://localhost:8888/Lab16ss/services/hello/gm1/sss";
	WebResource webres=client.resource(url1);
	String str=webres.get(String.class);
	System.out.println(str);
		
	System.out.println();
	String url2="http://localhost:8888/Lab16ss/services/hello/gm2/";
	webres=client.resource(url2);
	User user=new User();
	user.setName("srinivas");
	user.setEmail("srinivas@gmail.com");
	UserMessage um=webres.post(UserMessage.class,user);
	System.out.println(um.getMsg());
	

	
	//	New way BELOW CODE IS WORKING 
//		Client client=ClientBuilder.newClient();
//		Response response=client.target("http://localhost:8888/Lab15ss/services/hello/gm1/sss").request().get();
//	  System.out.println(response);
//	 String message=response.readEntity(String.class);
//	  System.out.println(message);
//	  User user=new User();
//	  user.setName("goop");
//      user.setEmail("gop@email.com");
//	 Response response1=client.target("http://localhost:8888/Lab15ss/services/hello/gm2").request().post(Entity.entity());
//	 String message1=response1.readEntity(String.class);
//	 System.out.println(message1);
		
		
		//BELOW CODE IS NOT WORKING
		
//		ClientConfig clientConfig = new ClientConfig();
//		Client client = ClientBuilder.newClient(clientConfig);
//		URI serviceURI = UriBuilder.fromUri(webServiceURI).build();
//		WebTarget webTarget = client.target(serviceURI);
//System.out.println(webTarget);
//		 //response
//		System.out.println(webTarget.path("services").path("hello").request()
//				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString());
//
		// text
//		System.out.println(webTarget.path("services").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));

//		// xml
//		System.out.println(webTarget.path("services").path("hello").request()
//				.accept(MediaType.TEXT_XML).get(String.class));
//
//		// html
//		System.out.println(webTarget.path("services").path("hello").request()
//				.accept(MediaType.TEXT_HTML).get(String.class));
//	
       
	}
	
	}