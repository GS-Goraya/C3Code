package com.jlcindia.hibernate;
import java.util.*;
public class Student {
		private int sid;
		private String city;
		private String sname;
		private  String status;
		private double totalfee;
		public Student() {}
		public Student( String sname,String city,String status,double totalfee) 
		{
		
		
			this.city=city;
			this.sname=sname;
			this.status=status;
			this.totalfee=totalfee;
			
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public double getTotalfee() {
			return totalfee;
		}
		public void setTotalfee(double totalfee) {
			this.totalfee = totalfee;
		}
         public String toString()
         {
        	 return sid+","+sname+","+city+","+status+","+totalfee;
         }

}

		
