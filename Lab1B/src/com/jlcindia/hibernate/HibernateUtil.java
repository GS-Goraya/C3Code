package com.jlcindia.hibernate;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
static SessionFactory factory;     // Its making sessionfactory object as singleton with static block.In Hibernate, 
                                   // a SessionFactory object is the only one heavy weight object,
                                   //because it stores Configuration data and all the Mapping data of the project.
                                   //If our project is a Desktop Application then there is no need to make SessionFactory
                                   //object as a Singleton, because only one user can access the Application at a time.
                                   //If a project is Distributed Application, it means it is a Web Application,
                                   //it means it is a web application or a remoting application then at a time multiple 
                                  // clent can send the request to the Server Application, if multiple SessionFactory
                                 ///  object are created then burden on a Server will be increased. So, we need to make
                               ///SessionFactory object of an Hibernate as Singleton.

static {
	
	Configuration  cfg=new Configuration (); //After reading all the properties from hibernate configuration and mapping documents configuration object is responsible to create the SessionFactory object.
	                                          // Once the session factory is created there is no use with configuration object.
	cfg=cfg.configure();                       // by deafult it will use hibernate.cfg.xml so we dont need to mention in configure()
	StandardServiceRegistryBuilder ssrbuilder =new StandardServiceRegistryBuilder();
	StandardServiceRegistry ssRegistry=ssrbuilder.applySettings(cfg.getProperties()).build();
  factory=cfg.buildSessionFactory(ssRegistry);
     	
}
public static SessionFactory getSessionFactory()
{

  return factory;	

}
}

