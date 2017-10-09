package com.avishek.hibernate;

import java.util.Date;

public class CreditCard {
	private int ccid;
	private int ccno;
	private int code;
	private String ctype;
	private Date expdate;
	
	private Customer customer;

	
	public CreditCard(){}
	
	
	public CreditCard(int ccid, int ccno, int code, String ctype, Date expdate) {
		this.ccid = ccid;
		this.ccno = ccno;
		this.code = code;
		this.ctype = ctype;
		this.expdate = expdate;
	}
	
	public CreditCard(int ccno, int code, String ctype, Date expdate) {
		this.ccno = ccno;
		this.code = code;
		this.ctype = ctype;
		this.expdate = expdate;
	}


	public int getCcid() {
		return ccid;
	}


	public void setCcid(int ccid) {
		this.ccid = ccid;
	}


	public int getCcno() {
		return ccno;
	}


	public void setCcno(int ccno) {
		this.ccno = ccno;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getCtype() {
		return ctype;
	}


	public void setCtype(String ctype) {
		this.ctype = ctype;
	}


	public Date getExpdate() {
		return expdate;
	}


	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "CreditCard [ccid=" + ccid + ", ccno=" + ccno + ", code=" + code + ", ctype=" + ctype + ", expdate="
				+ expdate + ", customer=" + customer + "]";
	}
	
	
}
