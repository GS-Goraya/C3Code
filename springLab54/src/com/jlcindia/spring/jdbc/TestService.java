package com.jlcindia.spring.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class TestService {
@Resource(name="oracleDs")
private DataSource oracleDs;

@Resource(name="mysqlDs")
private DataSource mysqlDs;

public void showOracleInfo()
{
try
{
Connection oracon=oracleDs.getConnection();
DatabaseMetaData oradbmd=oracon.getMetaData();
System.out.println(oradbmd.getDatabaseProductName());
System.out.println(oradbmd.getDefaultTransactionIsolation());

}
catch(Exception e)
{
	e.printStackTrace();
}
}
public void showMySQLInfo()
{
try {
Connection mycon=mysqlDs.getConnection();
DatabaseMetaData mydbmd=mycon.getMetaData();
System.out.println(mydbmd.getDatabaseProductName());	
System.out.println(mydbmd.getDefaultTransactionIsolation());
}	
catch(Exception e)
{
e.printStackTrace();	
}
}
}
