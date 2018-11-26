    package com.jlcindia.hibernate;
	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.context.spi.CurrentSessionContext;
	public class lab5B {
	public static void main(String[] args) {
		
			 Transaction tx=null;
		try
		{
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			// 1. loading the student
			
			Student st=(Student)session.load(Student.class, 1);
			System.out.println(st);
			
			//2. loading the current student
			
			CurrentStudent cst=( CurrentStudent)session.load(CurrentStudent.class,2);
			System.out.println(cst);
			
			// 3. loading the oldstudent
			OldStudent ost=(OldStudent)session.load(OldStudent.class,3 );
			System.out.println(ost);

			// 4. loading weekdaystudent
			
			WeekdayStudent wdstu=(WeekdayStudent)session.load(WeekdayStudent.class ,4);
			System.out.println(wdstu);
			
			//5. loading the WeekendStudent

			WeekendStudent wstu=(WeekendStudent)session.load(WeekendStudent.class,5);
			System.out.println(wstu);
			 tx.commit();
		      session.close();
		}
	        catch (Exception e) {
			e.printStackTrace();
		   if(tx!=null)
			   tx.rollback();
		}  
	}

	}
