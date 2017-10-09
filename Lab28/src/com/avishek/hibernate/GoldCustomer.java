package com.avishek.hibernate;

import java.util.Map;

public class GoldCustomer extends Customer {

	private long ophone;
	private int points;
	private Map<String, String> refs;
	
	public GoldCustomer(){}
	
	public GoldCustomer(int cid, String cname, String email, long phone, long ophone, int points,
			Map<String, String> refs) {
		super(cid, cname, email, phone);
		this.ophone = ophone;
		this.points = points;
		this.refs = refs;
	}
	
	public GoldCustomer(String cname, String email, long phone, long ophone, int points,
			Map<String, String> refs) {
		super(cname, email, phone);
		this.ophone = ophone;
		this.points = points;
		this.refs = refs;
	}

	public long getOphone() {
		return ophone;
	}

	public void setOphone(long ophone) {
		this.ophone = ophone;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Map<String, String> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "GoldCustomer [ophone=" + ophone + ", points=" + points + ", refs=" + refs + "]";
	}
	
	
	
}
