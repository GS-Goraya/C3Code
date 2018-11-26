package com.jlcindia.log4j;
import org.apache.log4j. *; 
public class Log4JSMTPTest {
static { 
PropertyConfigurator.configure("src/log4j.properties");
}
static Logger log= Logger.getLogger("Log4JSMTPTest");
public static void main(String[] args) {
System.out.println(" Started");
log.error("This is TEST MAIL");
System.out. println("Main Complete");
}
}