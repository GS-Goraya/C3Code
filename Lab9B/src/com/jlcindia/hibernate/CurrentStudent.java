package com.jlcindia.hibernate;
import java.util.*;
public class CurrentStudent extends Student  {

			private double feebal;
			private String timings;
			private String branch;
			private  String status;
			
			public CurrentStudent() {}
			public CurrentStudent(String city, String sname,String status,double totalfee,double feebal,String timings,String branch) 
			{
			
			  super(city,sname,status,totalfee);
				this.feebal=feebal;
				this.timings=timings;
				this.branch=branch;
			
				
			}
			
	      
			public double getFeebal() {
				return feebal;
			}
			public void setFeebal(double feebal) {
				this.feebal = feebal;
			}
			public String getTimings() {
				return timings;
			}
			public void setTimings(String timings) {
				this.timings = timings;
			}
			public String getBranch() {
				return branch;
			}
			public void setBranch(String branch) {
				this.branch = branch;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String toString()
	         {
	        	 return super.toString()+","+feebal+","+timings+","+branch;
	         }

	}

			
