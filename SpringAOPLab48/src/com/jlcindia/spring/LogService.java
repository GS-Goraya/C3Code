package com.jlcindia.spring;

public class LogService {

	public void logBefore()
	{
		System.out.println("Ls logBefore");
		
	}
	public void logReturning()
	{
		System.out.println("Ls - logReturning");
		
	}
	public void logThrowing(Exception e)
	{
		System.out.println("LS- logThrowing");
		System.out.println(e);
		
	}
}
