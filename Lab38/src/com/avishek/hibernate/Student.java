package com.avishek.hibernate;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(
				name="bid",
				column=@Column(name="bid")),
		@AttributeOverride(
				name="sid",
				column=@Column(name="sid")),
		
	})
private SID studentid;
private String sname;
private String email;
private long mob;

public Student() {
	
}

public Student(SID studentid, String sname, String email, long mob) {
	this.studentid = studentid;
	this.sname = sname;
	this.email = email;
	this.mob = mob;
}


public Student(String sname, String email, long mob) {	
	this.sname = sname;
	this.email = email;
	this.mob = mob;
}

public SID getStudentid() {
	return studentid;
}

public void setStudentid(SID studentid) {
	this.studentid = studentid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getMob() {
	return mob;
}

public void setMob(long mob) {
	this.mob = mob;
}


}
