package com.avishek.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int addid;
	private String street;
	private String city;
	private String state;
	
	@OneToOne(mappedBy="address")
	private Customer customer;
	
	public Address(){}
	
	public Address(int addid, String street, String city, String state) {
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
