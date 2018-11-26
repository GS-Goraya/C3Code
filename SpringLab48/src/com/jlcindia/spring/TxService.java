package com.jlcindia.spring;

public class TxService {
public void begin()
{
System.out.println("**TS-begin");	
}
public void commit()
{
System.out.println("TS- Commit"); 
}
public void rollback()
{
System.out.println("TS-rollback");	
}
}
