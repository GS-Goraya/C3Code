package com.jlcindia.hibernate;
import org.hibernate.*;

public class lab1A {
public static void main(String args[])
{
 Transaction tx=null;
 try
 {
	 SessionFactory sf=HibernateUtil.getSessionFactory();
	 Session session =sf.openSession();
	 tx=session.beginTransaction();
	 Customer cust=new Customer("sri","Nivas","Sri@gmail.com","12345");
	     session.save(cust);
	     Address add=new Address("HMT Main","Banglore","karnataka");
	     session.save(add);
	     cust.setAddress(add);
	 	 tx.commit();
	 session.close();
	 System.out.println("Record inserted ");
 }
 catch(Exception e)
  {

    e.printStackTrace();
	 if(tx!=null)
		 tx.rollback();
 }
 
}
}

