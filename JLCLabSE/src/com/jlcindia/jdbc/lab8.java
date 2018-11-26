package com.jlcindia.jdbc;

import java.sql.*;

public class lab8 {

	public static void main(String[] args) {
	   Connection con=null;
	   PreparedStatement ps=null;
	   try
	   {
		   con=jdbcutil.getMySQLConnection();
		   int sid=95;
		   String  nm="Nivas";
		   String em="nivas@jlc.com";
		   long phn=9595959L;
		   String qry="insert into jlcstudent values (?,?,?,?)";
		   ps=con.prepareStatement(qry);
		   ps.setInt(1, sid);
		   ps.setString(2, nm);
		   ps.setString(3, em);
		   ps.setLong(4, phn);
		   int x= ps.executeUpdate();
		   if(x==1)
			   System.out.println(" record Inserted ");
		   else
			   System.out.println("No record found");
	   }
		catch(Exception e)
	   {
			
			e.printStackTrace();
	   }
	   finally
	   {
		   jdbcutil.cleanup(ps,con);
	   }
		   
	   }

	}


