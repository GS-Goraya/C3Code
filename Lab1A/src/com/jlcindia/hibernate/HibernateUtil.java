package com.jlcindia.hibernate;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
static SessionFactory factory;   //singleton object of sessionFactory if it create multiple times it take all data from hibernate.cfg.xml multiple which is unnecessary
static {
	
	Configuration  cfg=new Configuration ();
	cfg=cfg.configure(); // It will identifies hibernate.cfg.xml document. If hibernate.cfg not then session factory create will be failed.
	StandardServiceRegistryBuilder ssrbuilder =new StandardServiceRegistryBuilder();
	StandardServiceRegistry ssRegistry=ssrbuilder.applySettings(cfg.getProperties()).build();
  factory=cfg.buildSessionFactory(ssRegistry);
     	
}
public static SessionFactory getSessionFactory()
{

  return factory;	

}
}

