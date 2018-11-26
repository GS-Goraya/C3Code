package com.jlcindia.spring;

public class LogService {
public void logBefore()
{
System.out.println("**LS-LogBefore");	
}
public void logReturning()
{
	
System.out.println("LS-logReturning");
}
public void logThrowing(Exception e)
{
System.out.println("**Ls-logThrowing *");	
System.out.println(e);
}
}
