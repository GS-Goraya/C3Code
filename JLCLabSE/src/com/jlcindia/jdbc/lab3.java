package com.jlcindia.jdbc;
import java.sql.*;


public class lab3 {

	public static void main(String[] args) {
		
				Connection con= null;
				Statement st=null;
				try
				{
			
					con=jdbcutil.getMySQLConnection();
					/// prepared the sql statements
					String sql="insert into jlcstudent values (100,'sri','sri@jlc',999999999)";
					// create the jdbc statements
					st=con.createStatement();
					int x=st.executeUpdate(sql);
					if(x==1)
					System.out.println("Record inserted");
					else
				    System.out.println("Record not inserted");
					
					
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
					
				}
				finally
				{
					jdbcutil.cleanup(st, con);
				}
				

			}
	}


