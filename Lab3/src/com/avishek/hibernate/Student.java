package com.avishek.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {



private int sid;
private String sname;
private String dob;
private String quali;
private String[] course;
private List<String> emails;
private List<Integer> marks;
private Set<Long> phones;
private Map<String,Long> refs;

public Student() {

}




public Student(String sname, String dob, String quali, String[] course, List<String> emails, List<Integer> marks,
		Set<Long> phones, Map<String, Long> refs) {

	this.sname = sname;
	this.dob = dob;
	this.quali = quali;
	this.course = course;
	this.emails = emails;
	this.marks = marks;
	this.phones = phones;
	this.refs = refs;
}




public Student(int sid, String sname, String dob, String quali, String[] course, List<String> emails,
		List<Integer> marks, Set<Long> phones, Map<String, Long> refs) {
	
	this.sid = sid;
	this.sname = sname;
	this.dob = dob;
	this.quali = quali;
	this.course = course;
	this.emails = emails;
	this.marks = marks;
	this.phones = phones;
	this.refs = refs;
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

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getQuali() {
	return quali;
}

public void setQuali(String quali) {
	this.quali = quali;
}

public String[] getCourse() {
	return course;
}

public void setCourse(String[] course) {
	this.course = course;
}

public List<String> getEmails() {
	return emails;
}

public void setEmails(List<String> emails) {
	this.emails = emails;
}

public List<Integer> getMarks() {
	return marks;
}

public void setMarks(List<Integer> marks) {
	this.marks = marks;
}

public Set<Long> getPhones() {
	return phones;
}

public void setPhones(Set<Long> phones) {
	this.phones = phones;
}

public Map<String, Long> getRefs() {
	return refs;
}

public void setRefs(Map<String, Long> refs) {
	this.refs = refs;
}




@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", dob=" + dob + ", quali=" + quali;
}













}
