package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab32A {
	public static void main(String[] args) {
   Transaction tx=null;
		try
		{
			 SessionFactory sf=HibernateUtil.getSessionFactory();
			 Session session =sf.openSession();
			 tx=session.beginTransaction();	
			 //Display the customers by cardtype
			 String hql="from Customer cust where cust.cardType=?";
			 Query query=session.createQuery(hql);
			 query.setString(0, "VISA");
			 List<Customer>list=query.list();
			 for(Customer cust:list)
				 System.out.println(cust);
			 tx.commit();
			session.close();
		}
		catch(Exception e)
		{
		if(tx!=null)	
		{
			tx.rollback();
		}
		e.printStackTrace();
		}
		}
}
