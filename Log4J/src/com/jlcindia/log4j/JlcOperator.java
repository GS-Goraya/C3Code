package com.jlcindia.log4j;
import org.apache.log4j.Logger;
public class JlcOperator {
Logger log= Logger.getLogger(this.getClass());
public int getRemainder(String ab, String bc) {
log.info( "- getRemainder invoked -");
log.debug("Values :" +ab+ "\t" + bc);
int rem= -1;
try {
int val1 = Integer.parseInt(ab);
log.debug("lst int values:"+ val1);
int val2 = Integer.parseInt(bc);
log.debug("2nd int values : " + val2);
log.info(" Calculating remainder");
rem = val1 % val2;
log.info("Remainder Calculated ");
} catch (Exception e) {
log.error("Exception Occured"); }
log.debug("Calculated Remainder:" +rem);
log.info("Returning Remainder:");
return rem;
}
}