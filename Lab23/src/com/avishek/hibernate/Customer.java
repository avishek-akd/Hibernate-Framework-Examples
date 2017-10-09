package com.avishek.hibernate;




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
private long phone;
	
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name="city",column=@Column(name="mycity")),
			@AttributeOverride(name="street",column=@Column(name="mystreet"))
	})
private Address address;

public Customer() {
	
}

public Customer(int id, String name, String email, long phone, Address address) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.address = address;
}

public Customer(String name, String email, long phone, Address address) {
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.address = address;
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

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
			+ "]";
}


}
