package com.avishek.hibernate;

import java.util.Set;

public class Customer {
private int cid;
private String cname;
private String email;
private long phone;

private Set<Order> order;
private CreditCard ccard;

public Customer() {
	
}



public Customer(int cid, String cname, String email, long phone) {
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;
}

public Customer(String cname, String email, long phone) {
	this.cname = cname;
	this.email = email;
	this.phone = phone;
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



public Set<Order> getOrder() {
	return order;
}



public void setOrder(Set<Order> order) {
	this.order = order;
}



public CreditCard getCcard() {
	return ccard;
}



public void setCcard(CreditCard ccard) {
	this.ccard = ccard;
}



@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
}



}
