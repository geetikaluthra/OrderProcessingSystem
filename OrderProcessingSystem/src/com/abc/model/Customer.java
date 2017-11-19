package com.abc.model;

import java.util.TreeSet;

public class Customer {
	private String name;
	private int id;
	private String Address;
	private long phone;
	private static int cid=1;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		this.id = cid;
		cid++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void editAddress(String address){
		setAddress(address);
	}
	
	public void editPhone(long phoneNo){
		setPhone(phoneNo);
	}
	
}
