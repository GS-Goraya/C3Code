package com.jlcindia.jdbc;
import java.sql.*;
public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Connection con=null;
 PreparedStatement ps= null;
 ResultSet rs=null;
 try
 {
	 con=jdbcutil.getMySQLConnection();
	 String qry=null;
	 qry="update jlcstudent set phone =90090900";
	 ps=con.prepareStatement(qry);
	 boolean b1=ps.execute();
	 if(b1)
	 {
		 rs=ps.getResultSet();
		 if(rs.next())
		 {
			 do {
				 
				 int sid=rs.getInt(1);
				 String nm=rs.getString(2);
				 String em=rs.getString(3);
				 long phn=rs.getLong(4);
				 System.out.println(sid+"\t"+nm+"\t"+em+"\t"+phn);
				 
			 }
			 
			 while(rs.next());	 
		 }
	 }
	 else
	 {
		 int x=ps.getUpdateCount();
		 System.out.println("rsult"+x);
		 
	 }}
	 
	 catch(Exception e)
	 {
		e.printStackTrace(); 
		 
	 }
  finally
  {
	  
	  jdbcutil.cleanup(rs,ps,con);
  }
	 
	 
	 
 
}}
