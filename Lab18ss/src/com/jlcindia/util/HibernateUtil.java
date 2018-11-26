package com.jlcindia.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static SessionFactory factory;
private static final ThreadLocal<Session> threadLocal = new ThreadLocal();
static {
//	try {
//	Configuration configuration = new Configuration().configure();
//	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
//	applySettings(configuration.getProperties());
//	SessionFactory factory = configuration.buildSessionFactory(builder.build());
//	}catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
	Configuration  cfg=new Configuration ();
	cfg=cfg.configure();
StandardServiceRegistryBuilder ssrbuilder =new StandardServiceRegistryBuilder();
	StandardServiceRegistry ssRegistry=ssrbuilder.applySettings(cfg.getProperties()).build();
factory=cfg.buildSessionFactory(ssRegistry); 
	
////Configuration configuration = new Configuration();
////configuration.configure("jlcindia.cfg.xml");
////StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//// factory = configuration.buildSessionFactory(ssrb.build());    	
}
public static Session getSession() {
	// TODO Auto-generated method stub
	return factory.openSession();
}

public static void closeSession() throws HibernateException {
	Session session = (Session) threadLocal.get();
    threadLocal.set(null);

    if (session != null) {
      session.close();
    }
}
}