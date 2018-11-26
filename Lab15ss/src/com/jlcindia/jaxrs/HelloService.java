package com.jlcindia.jaxrs;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloService {
@GET
@Path("/gm1/{name}")
public String getMessage1(@PathParam("name")String nm)
{
String msg="Hello "+ nm +" Welcome to Rest Web Services";
System.out.println(msg);
return msg;
}
@POST
@Path("/gm2/")
public UserMessage getMessage2(User user)
{
String nm=user.getName();
String em=user.getEmail();
String msg="Hello " +nm+" Welcome to Rest Web Services\nyour email is "+em;
System.out.println(msg);
UserMessage um=new UserMessage();
um.setMsg(msg);
return um;
}

}
