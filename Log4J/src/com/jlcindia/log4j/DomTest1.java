package com.jlcindia.log4j;
import org.apache.log4j. *;
import org.apache.log4j.xml.DOMConfigurator; 

public class DomTest1 {
	static { 
		DOMConfigurator.configure("src/log4j.xml");
		}
		static Logger log= Logger.getLogger("DomTest1");
		public static void main(String[] args) {
		System.out.println(" Started");
		log.debug("This is TEST MAIL");
		System.out. println("Main Complete");
		}
}
