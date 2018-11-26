package com.jlcindia.util;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
@WebListener
public class Log4Util implements ServletContextListener{
Logger log=Logger.getLogger(Log4Util.class);
@Override
public void contextInitialized(ServletContextEvent sce) {
PropertyConfigurator.configure(" jlc-log4j.properties");
log.info("Log4J System is initialized at Container StartUp");
}
@Override
public void contextDestroyed(ServletContextEvent sce) { }}