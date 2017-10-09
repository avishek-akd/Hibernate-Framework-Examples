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
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;
private String cname;
private int duration;
private double cost;
	@ManyToMany(mappedBy="course")
private Set<Student> student;

public Course() {
}



public Course(int cid, String cname, int duration, double cost) {
	this.cid = cid;
	this.cname = cname;
	this.duration = duration;
	this.cost = cost;
}



public Course(String cname, int duration, double cost) {
	this.cname = cname;
	this.duration = duration;
	this.cost = cost;
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



public int getDuration() {
	return duration;
}



public void setDuration(int duration) {
	this.duration = duration;
}



public double getCost() {
	return cost;
}



public void setCost(double cost) {
	this.cost = cost;
}



public Set<Student> getStudent() {
	return student;
}



public void setStudent(Set<Student> student) {
	this.student = student;
}



@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", cost=" + cost + "]";
}




}