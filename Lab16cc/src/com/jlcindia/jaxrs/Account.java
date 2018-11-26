package com.jlcindia.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Account
{
private int accno;
private double balance;

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Account(int accno,double balance)
{
this.accno=accno;
this.balance=balance;
}
public Account() {}
}