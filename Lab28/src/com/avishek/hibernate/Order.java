package com.avishek.hibernate;

import java.util.Date;
import java.util.Set;

public class Order {

	private int orderid;
	private double totalcost;
	private Date orderdate;
	private int totalquantity;
	private String status;
	
	
	private Customer customer;
	private ShippingAddress address;
	private Set<OrderItem> orderitems;
	
	
	
	public Order(){}
	
	public Order(int orderid, double totalcost, Date orderdate, int totalquantity, String status) {
		this.orderid = orderid;
		this.totalcost = totalcost;
		this.orderdate = orderdate;
		this.totalquantity = totalquantity;
		this.status = status;
	}
	

	public Order(double totalcost, Date orderdate, int totalquantity, String status) {
		this.totalcost = totalcost;
		this.orderdate = orderdate;
		this.totalquantity = totalquantity;
		this.status = status;
	}
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotalquantity() {
		return totalquantity;
	}
	public void setTotalquantity(int totalquantity) {
		this.totalquantity = totalquantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ShippingAddress getAddress() {
		return address;
	}
	public void setAddress(ShippingAddress address) {
		this.address = address;
	}
	public Set<OrderItem> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(Set<OrderItem> orderitems) {
		this.orderitems = orderitems;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", totalcost=" + totalcost + ", orderdate=" + orderdate
				+ ", totalquantity=" + totalquantity + ", status=" + status + ", customer=" + customer + "]";
	}
	
	
}
