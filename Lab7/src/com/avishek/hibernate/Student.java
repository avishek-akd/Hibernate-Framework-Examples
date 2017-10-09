package com.avishek.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {



private int sid;
private String sname;
private String city;
private String status;
private double totalfee;


public Student() {

}


public Student(int sid, String sname, String city, String status, double totalfee) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.city = city;
	this.status = status;
	this.totalfee = totalfee;
}


public Student(String sname, String city, String status, double totalfee) {
	super();
	this.sname = sname;
	this.city = city;
	this.status = status;
	this.totalfee = totalfee;
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
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


@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", status=" + status + ", totalfee="
			+ totalfee + "]";
}


















}
