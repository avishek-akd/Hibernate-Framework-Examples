package com.avishek.hibernate;

public class Customer {
private int id;
private String name;
private String email;
private long mob;
private String city;
private double bal;


public Customer() {
	System.out.println("DC...");
}

public Customer(int id, String name, String email, long mob, String city, double bal) {
	System.out.println("CW_PK...");
	this.id = id;
	this.name = name;
	this.email = email;
	this.mob = mob;
	this.city = city;
	this.bal = bal;
}


public Customer(String name, String email, long mob, String city, double bal) {
	System.out.println("CWO_PK...");
	this.name = name;
	this.email = email;
	this.mob = mob;
	this.city = city;
	this.bal = bal;
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
