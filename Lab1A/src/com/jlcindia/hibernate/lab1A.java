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
	 Customer cust=new Customer("sri","sri@jlc",1234,"Banglore",25000.0);
	     session.save(cust); //save method storing object into session cache.
	    tx.commit(); //commit method flush all the obj from session cache into DB table.
	 	              //Auto.commit() is disable into hibernate by default.
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

