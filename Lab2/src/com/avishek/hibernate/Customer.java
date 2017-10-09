package com.avishek.hibernate;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="customer1")
public class Customer {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private int id;

@Column(name="name")
private String name;

@Column(name="email")
private String email;

@Column(name="mob")
private long mob;

@Column(name="city")
private String city;

@Column(name="bal")
private double bal;


public Customer() {
	
}

public Customer(int id, String name, String email, long mob, String city, double bal) {
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
