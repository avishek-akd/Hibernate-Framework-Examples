package com.avishek.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ostudent")
@DiscriminatorValue("OSTU")
public class OldStudent extends Student{

	private String ocompany;
	private String oemail;
	private double octc;
	
	public OldStudent(){}
	
	public OldStudent(int sid, String sname, String city, String status, double totalfee, String ocampany,
			String oemail, double octc) {
		super(sid, sname, city, status, totalfee);
		this.ocompany = ocampany;
		this.oemail = oemail;
		this.octc = octc;
	}
	
	public OldStudent(String sname, String city, String status, double totalfee, String ocampany,
			String oemail, double octc) {
		super(sname, city, status, totalfee);
		this.ocompany = ocampany;
		this.oemail = oemail;
		this.octc = octc;
	}

	public String getOcompany() {
		return ocompany;
	}

	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	public double getOctc() {
		return octc;
	}

	public void setOctc(double octc) {
		this.octc = octc;
	}

	@Override
	public String toString() {
		return "OldStudent ["+super.toString()+"ocampany=" + ocompany + ", oemail=" + oemail + ", octc=" + octc + "]";
	}
	
	
}
