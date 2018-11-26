package com.jlcindia.spring;

public class hello {
 private A aobj;   //S.I
 private B bobj;   //C.I
 public void setAobj(A aobj)
 {
	 System.out.println("Hello setAobj");
	 this.aobj=aobj;
	
	 
 }
 public hello (B bobj)
 {
	 System.out.println("hello 1 arg");
	 this.bobj=bobj;
	 
 }
 public void show()
 {
	 System.out.println("show in Hello");
   aobj.showA();
   bobj.showB();
 }
}
