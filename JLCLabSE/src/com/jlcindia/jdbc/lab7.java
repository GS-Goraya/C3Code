package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class lab7 {

	public static void main(String[] args) {
		Connection con= null;
		Statement st=null;
		ResultSet rs =null;
		try
		{
	
		con=jdbcutil.getMySQLConnection();
		String sql=null;
		sql="select * from jlcstudent";
		// create the jdbc statements
		st=con.createStatement();
		 boolean b=st.execute(sql);
		 if(b)
		 {
		 rs=st.getResultSet();
		 if(rs.next()) {
	    do {

		     int id=rs.getInt(1);
			  String sn=rs.getString(2);
			  String em=rs.getString(3);
		     int ph=rs.getInt(4);
		     System.out.println(id+"\t"+sn+"\t"+em+"\t"+ph);   	 
	     
	     
	}
	    while(rs.next());
		 }	 }
	else
	{
		int x=st.getUpdateCount();
   System.out.println("Result" +x);
   }}

	catch(Exception e)
	{
		
		e.printStackTrace();
		
	}
	finally
	{
		jdbcutil.cleanup(rs,st, con);
	}

	}


}