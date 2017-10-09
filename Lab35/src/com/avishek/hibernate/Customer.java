package com.avishek.hibernate;

public class Customer {
private String id;
private String name;
private String email;
private long mob;
private String city;
private double bal;


public Customer() {
	
}

public Customer(String id, String name, String email, long mob, String city, double bal) {
	
	this.id = id;
	this.name = name;
	this.email = email;
	this.mob = mob;
	this.city = city;
	this.bal = bal;
}


public Customer(String name, String email, long mob, String city, double bal) {

	this.name = name;
	this.email = email;
	this.mob = mob;
	this.city = city;
	this.bal = bal;
}


public String getId() {
	return id;
}
public void setId(String id) {
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}



}
