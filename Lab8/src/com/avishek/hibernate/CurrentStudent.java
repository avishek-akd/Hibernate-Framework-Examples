package com.avishek.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cstudent")
@DiscriminatorValue("CSTU")
public class CurrentStudent extends Student{
	private double feebal;
	private String timing;
	private String branch;
	
	
	public CurrentStudent(){}
	
	public CurrentStudent(int sid, String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch) {
		super(sid, sname, city, status, totalfee);
		this.feebal = feebal;
		this.timing = timing;
		this.branch = branch;
	}
	
	public CurrentStudent( String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch) {
		super(sname, city, status, totalfee);
		this.feebal = feebal;
		this.timing = timing;
		this.branch = branch;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "CurrentStudent ["+super.toString()+"feebal=" + feebal + ", timing=" + timing + ", branch=" + branch + "]";
		
	}
	


	
	
	
}
