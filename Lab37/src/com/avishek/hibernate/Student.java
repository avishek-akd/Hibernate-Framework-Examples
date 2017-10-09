package com.avishek.hibernate;

public class Student {
	
private SID studentid;
private String sname;
private String email;
private long mob;

public Student() {
	
}

public Student(SID studentid, String sname, String email, long mob) {
	this.studentid = studentid;
	this.sname = sname;
	this.email = email;
	this.mob = mob;
}


public Student(String sname, String email, long mob) {	
	this.sname = sname;
	this.email = email;
	this.mob = mob;
}

public SID getStudentid() {
	return studentid;
}

public void setStudentid(SID studentid) {
	this.studentid = studentid;
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

public long getMob() {
	return mob;
}

public void setMob(long mob) {
	this.mob = mob;
}


}
