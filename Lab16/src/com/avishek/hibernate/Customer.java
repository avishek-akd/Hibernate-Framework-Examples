package com.avishek.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
private int cid;
private String fname;
private String lname;
private String email;
private long phone;
	@OneToMany(mappedBy="customer")
private Set<Request> request;

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







public Set<Request> getRequest() {
	return request;
}



public void setRequest(Set<Request> request) {
	this.request = request;
}



@Override
public String toString() {
	return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
			+ "]";
}





}