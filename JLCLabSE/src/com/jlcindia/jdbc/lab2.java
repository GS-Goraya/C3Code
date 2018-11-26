package com.jlcindia.jdbc;
import java.sql.*;
public class lab2 {
public static void main(String args[])
{
 Connection con = null;
 Statement st= null;
 ResultSet res =null;
 try {
	 Class.forName("com.mysql.jdbc.Driver");
   	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	 String sql="select * from jlcstudent";
	 st=con.createStatement();
	 res=st.executeQuery(sql);
	  while(res.next())
	  {
	     int sid=res.getInt(1);
		  String sn=res.getString(2);
		  String em=res.getString(3);
	     int ph=res.getInt(4);
	     System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);
	     
	  }
	 
	 
 }
 catch(Exception e )
 {
	 
	 e.printStackTrace();
	 
 }
finally
{
	
try
{
if(res!=null)
	res.close();
if(st!=null)
	st.close();
if(con!=null)
	con.close();

	}
catch(Exception e)
{
	e.printStackTrace();
}
}



}
}
