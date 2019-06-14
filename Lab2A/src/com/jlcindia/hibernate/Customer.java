package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity    //@Entity annotation defines that a class can be mapped to a table. 
@Table(name="customers")

public class Customer {
    @Id   //In annotation hibernate will not generate PK. It will used DB based algo for PK. genrate.
          // But in XML we have clearly mentioned <genrator class="increment"/>
    @GeneratedValue(strategy=GenerationType.AUTO  ) //It based on DB algo.
     @Column(name="cid")
	private int cid;
    @Column(name="cname")
	private String cname;
    @Column(name="email")
	private String email;
    @Column(name="phone")
	private long phone;
    @Column(name="city")
	private  String city;
    @Column(name="bal")
    private double bal;
	public Customer() {}
	public Customer(String cname, String email, long phone,String city, double bal) {
		// TODO Auto-generated constructor stub
		this.cname=cname;
		this.email=email;
		this.phone=phone;
		this.city=city;
		this.bal=bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

}
