package com.avishek.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Contact {



private int cid;
private String fname;
private String lname;
private String email;
private long phone;
private String dob;
private String status;


public Contact() {

}


public Contact(int cid, String fname, String lname, String email, long phone, String dob, String status) {
	this.cid = cid;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.status = status;
}


public Contact(String fname, String lname, String email, long phone, String dob, String status) {
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.status = status;
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


public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return "Contact [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
			+ ", dob=" + dob + ", status=" + status + "]";
}











}
