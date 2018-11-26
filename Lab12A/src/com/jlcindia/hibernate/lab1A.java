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
	 Customer cust=(Customer) session.load(Customer.class,1);
	 System.out.println(cust.getCid()+"\t"+cust.getLastName()+"\t"+cust.getEmail()+"\t"+cust.getPhone());
  Address add1=cust.getAddress();
  System.out.println(add1.getAid()+"\t"+add1.getCity()+"\t"+add1.getState()+"\t"+add1.getStreet());

  Address add=(Address)session.load(Address.class,1);
	 System.out.println(add.getAid()+"\t"+add.getCity()+"\t"+add.getState()+"\t"+add.getStreet());
	 tx.commit();
	 session.close();
	 }
 catch(Exception e)
  {

    e.printStackTrace();
	 if(tx!=null)
		 tx.rollback();
 }
 
}
}

