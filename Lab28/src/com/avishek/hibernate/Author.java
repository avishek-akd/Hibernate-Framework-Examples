package com.avishek.hibernate;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Author {
	private int aid;
	private String aname;
	private String email;
	private long phone;
	private Date dob;
	
	private List<String> qualis;
	private List<String> exps;
	
	private Set<Book> book;
	
	
	public Author(){}
	
	public Author(int aid, String aname, String email, long phone, Date dob, List<String> qualis, List<String> exps) {
		this.aid = aid;
		this.aname = aname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.qualis = qualis;
		this.exps = exps;
	}
	
	public Author(String aname, String email, long phone, Date dob, List<String> qualis, List<String> exps) {
		this.aname = aname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.qualis = qualis;
		this.exps = exps;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getQualis() {
		return qualis;
	}

	public void setQualis(List<String> qualis) {
		this.qualis = qualis;
	}

	public List<String> getExps() {
		return exps;
	}

	public void setExps(List<String> exps) {
		this.exps = exps;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", qualis=" + qualis + ", exps=" + exps + ", book=" + book + "]";
	}
	
	
	
}
