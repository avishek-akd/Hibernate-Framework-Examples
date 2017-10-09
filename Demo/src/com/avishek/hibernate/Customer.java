package com.avishek.hibernate;

public class Customer {

	private int id;
	private String name;
	private String email;
	private long phone;
	private String city;
	private double bal;
	

	public Customer(){
		System.out.println("Created");
	}
	
	
	public Customer(int id, String name, String email, long phone, String city, double bal) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}
	
	public Customer(String name, String email, long phone, String city, double bal) {
		this.name = name;
		this.email = email;
		this.phone = phone;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
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
