package com.jlcindia.spring;

public class TxService {
public void begin()
{
System.out.println("TS- begin");
}
public void commit()
{
System.out.println("TS- done");
}
public void rollback()
{
System.out.println("TS- end");	
}

}
