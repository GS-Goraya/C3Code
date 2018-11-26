package com.jlcindia.jdbc;
import java.sql.*;
public class lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Connection con=null;
      PreparedStatement ps=null;
      ResultSet rs=null;
      try
      {
    	  con=jdbcutil.getMySQLConnection();
    	  int sid=97;
    	  String qry="Select * from jlcstudent where sid=?";
    	  ps=con.prepareStatement(qry);
    	  ps.setInt(1,sid);
    	  rs=ps.executeQuery();
    	  if(rs.next())
    	  {
    		  int id=rs.getInt(1);
    		  String nm=rs.getString(2);
    		  String em=rs.getString(3);
    		  long phn=rs.getLong(4);
    		  System.out.println(id+"\t"+nm+"\t"+em+"\t"+phn);
    		  
    	  }
    	  else
    	  {
    		  System.out.println("no reord found ");
    	  }}
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
    	  finally
    	  {
    		  jdbcutil.cleanup(rs,ps,con);
    	  }
      }
	}


