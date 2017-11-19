package com.abc.model;

public class Customer {
	private String name;
	private int id;
	private String Address;
	private long phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void addNewProduct(Product p){
		
	}
	
	public void deleteExistingProduct(){
		
	}
	
	public void editAddress(String address){
		
	}
	
	public void editPhone(long phoneNo){
		
	}
	
}
