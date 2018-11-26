package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;



public class DSLab {
public static void main(String[] args) {
	Connection con =null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try
	{
		DataSource ds=DataSourceUtil.getDataSource();
		con=ds.getConnection();
		String sql="select * from jlcstudents";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery(sql);
		while(rs.next())
		{
		int id=rs.getInt(1);
		String sn=rs.getString(2);
		String em=rs.getString(3);
		long ph=rs.getLong(4);
		System.err.println(id+"\t"+sn+"\t"+em+"\t"+ph);
		}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
finally
{
	DataSourceUtil.cleanup(rs,ps,con);
	
}
	
}
}