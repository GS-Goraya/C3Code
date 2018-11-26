package com.jlcindia.jdbc;
import java.sql.*;
public class lab6 {

	public static void main(String[] args) {
		Connection con= null;
		Statement st=null;
		ResultSet rs =null;
		try
		{
	
		con=jdbcutil.getMySQLConnection();
		int sid=97;
		String sql=String .format("select * from jlcstudent where sid=%d", sid);
		// create the jdbc statements
		st=con.createStatement();
		 rs=st.executeQuery(sql);
		if(rs.next()) {
	    

		     int id=rs.getInt(1);
			  String sn=rs.getString(2);
			  String em=rs.getString(3);
		     int ph=rs.getInt(4);
		     System.out.println(id+"\t"+sn+"\t"+em+"\t"+ph);   	 
	     
	     
	}
	else
   System.out.println("sorry student not record found");}

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
