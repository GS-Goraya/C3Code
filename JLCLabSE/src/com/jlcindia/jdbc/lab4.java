package com.jlcindia.jdbc;
import java.sql.*;
public class lab4 {

	public static void main(String[] args) {
				
						Connection con= null;
						Statement st=null;
						ResultSet rs =null;
						try
						{
					
							con=jdbcutil.getMySQLConnection();
							/// prepared the sql statements
							String sql="select * from jlcstudent";
							// create the jdbc statements
							st=con.createStatement();
							 rs=st.executeQuery(sql);
							if(rs.next()) {
						     do {

							     int sid=rs.getInt(1);
								  String sn=rs.getString(2);
								  String em=rs.getString(3);
							     int ph=rs.getInt(4);
							     System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);   	 
						     }
						     while(rs.next());
						}
						else
					   System.out.println("no record found");}
	
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


