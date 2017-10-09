package com.avishek.hibernate;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
private String sname;
private String email;
private long phone;
	@ManyToMany
	@JoinTable(name="std_cou", joinColumns=@JoinColumn(name="mysid", referencedColumnName="sid"), 
	inverseJoinColumns=@JoinColumn(name="mycid", referencedColumnName="cid"))
private Set<Course> course;

public Student() {
}


public Student(int sid, String sname, String email, long phone) {
	this.sid = sid;
	this.sname = sname;
	this.email = email;
	this.phone = phone;
}

public Student(String sname, String email, long phone) {
	this.sname = sname;
	this.email = email;
	this.phone = phone;
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






public Set<Course> getCourse() {
	return course;
}


public void setCourse(Set<Course> course) {
	this.course = course;
}


@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
}





}