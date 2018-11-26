package com.jlcindia.jdbc;
import java.sql.*;
public class lab5 {

	public static void main(String[] args) {
						Connection con= null;
						Statement st=null;
						try
						{
					
							con=jdbcutil.getMySQLConnection();
							/// prepared the sql statements
							int sid=97;
							String nm="mainsh";
							String em="manish@hmail";
							long phn=9797979l;
							
							String sql=String.format("insert into jlcstudent values (%d,'%s','%s',%d)",sid,nm,em,phn);
							// create the jdbc statements
							System.out.println(sql);
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



