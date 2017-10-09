package com.avishek.hibernate;

import java.util.Map;

public class SilverCustomer extends Customer {

	private String city;
	private String oemail;
	private int rpoints;
	private Map<String, String> refs;
	
	public SilverCustomer(){}

	public SilverCustomer(int cid, String cname, String email, long phone, String city, String oemail, int rpoints,
			Map<String, String> refs) {
		super(cid, cname, email, phone);
		this.city = city;
		this.oemail = oemail;
		this.rpoints = rpoints;
		this.refs = refs;
	}
	
	public SilverCustomer(String cname, String email, long phone, String city, String oemail, int rpoints,
			Map<String, String> refs) {
		super(cname, email, phone);
		this.city = city;
		this.oemail = oemail;
		this.rpoints = rpoints;
		this.refs = refs;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	public int getRpoints() {
		return rpoints;
	}

	public void setRpoints(int rpoints) {
		this.rpoints = rpoints;
	}

	public Map<String, String> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "SilverCustomer [city=" + city + ", oemail=" + oemail + ", rpoints=" + rpoints + ", refs=" + refs + "]";
	}
	
	
	
	
	
}
