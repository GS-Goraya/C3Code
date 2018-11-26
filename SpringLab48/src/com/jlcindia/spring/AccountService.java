package com.jlcindia.spring;

public class AccountService {
public void getBal()
{
System.out.println("getBal-begin");	
System.out.println("getBal-done");	
System.out.println("getBal-end");	

}
public void mydeposit()
{
	System.out.println("deposit-begin");
	System.out.println("deposit-done");	
	System.out.println("deposit-end");	
}
public void mywithdraw() throws Exception 
{
	System.out.println("wihtdraw-begin");
	if(1==1)
	{
	  throw new InsufficentFundsException();	
	}
	System.out.println("withdraw-end");	
	}

}
