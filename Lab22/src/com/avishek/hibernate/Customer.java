package com.avishek.hibernate;



import java.util.*;
import java.util.Date;
import java.sql.*;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String email;
private long mob;
	@Version
	@Temporal(TemporalType.TIMESTAMP)
	//@Temporal(TemporalType.TIME)
	//@Temporal(TemporalType.DATE)
private Date tstamp;

public Customer() {
	
}



public Customer(int id, String name, String email, long mob) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.mob = mob;
}

public Customer(String name, String email, long mob) {
	this.name = name;
	this.email = email;
	this.mob = mob;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
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







public Date getTstamp() {
	return tstamp;
}



public void setTstamp(Date tstamp) {
	this.tstamp = tstamp;
}



@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mob=" + mob + ", tstamp=" + tstamp + "]";
}


}