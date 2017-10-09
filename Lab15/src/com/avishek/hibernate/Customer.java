package com.avishek.hibernate;

import java.util.Set;

public class Customer {
private int cid;
private String fname;
private String lname;
private String email;
private long phone;

private Set<Request> requests;

public Customer() {
}



public Customer(int cid, String fname, String lname, String email, long phone) {
	this.cid = cid;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.phone = phone;
}

public Customer(String fname, String lname, String email, long phone) {
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.phone = phone;
}



public int getCid() {
	return cid;
}



public void setCid(int cid) {
	this.cid = cid;
}



public String getFname() {
	return fname;
}



public void setFname(String fname) {
	this.fname = fname;
}



public String getLname() {
	return lname;
}



public void setLname(String lname) {
	this.lname = lname;
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




public Set<Request> getRequests() {
	return requests;
}



public void setRequests(Set<Request> requests) {
	this.requests = requests;
}



@Override
public String toString() {
	return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
			+ "]";
}





}