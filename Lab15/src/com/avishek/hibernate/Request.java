package com.avishek.hibernate;

public class Request {

	private int reqid;
	private String reqdate;
	private String descp;
	private String status;
	
	private Customer customer;
	
	public Request(){}

	

	public Request(int reqid, String reqdate, String descp, String status) {
		this.reqid = reqid;
		this.reqdate = reqdate;
		this.descp = descp;
		this.status = status;
	}


	public Request(String reqdate, String descp, String status) {
		this.reqid = reqid;
		this.reqdate = reqdate;
		this.descp = descp;
		this.status = status;
	}

	public int getReqid() {
		return reqid;
	}



	public void setReqid(int reqid) {
		this.reqid = reqid;
	}



	public String getReqdate() {
		return reqdate;
	}



	public void setReqdate(String reqdate) {
		this.reqdate = reqdate;
	}



	public String getDescp() {
		return descp;
	}



	public void setDescp(String descp) {
		this.descp = descp;
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



	@Override
	public String toString() {
		return "Request [reqid=" + reqid + ", reqdate=" + reqdate + ", desc=" + descp + ", status=" + status + "]\n";
	}
	
	
	
}
