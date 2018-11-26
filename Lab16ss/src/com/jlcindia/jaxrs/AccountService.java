package com.jlcindia.jaxrs;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/account")
public class AccountService {
@GET
@Path("/getbal/{accno}")
public Account getBal(@PathParam("accno")int ano)
{

System.out.println("** getBal() Method **");
if(ano<101)
	return new Account(ano,10000.0);
else
	return new Account(ano,25000.0);
}
@GET
@Path("/deposit/{accno}/{amount}")
public String deposit(@PathParam("accno")int ano,@PathParam("amount")double amt)
{
	System.out.println("** deposit() method **");
System.out.println(ano+"\t"+amt);
String msg="your amount has been deposited sucessfully";
System.out.println(msg);
return msg;

}
@GET
@Path("/withdraw/{accno}/{amount}")
public String withdraw(@PathParam("accno")int ano,@PathParam("amount")double amt)
{
System.out.println("** wihtdraw () method **");
System.out.println(ano +"\t"+amt);
String msg="your amount has been withdraw sucessfully";
System.out.println(msg);
return msg;
}
}
