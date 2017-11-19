package com.abc.model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TreeSet;

public class Order implements Comparable<Order> {

	private int orderId;
	private double amount;
	private Date orderDate;
	private static int cid=1;
	private int customerId;
	private String customerName;
	private Arrays productId[];
	
	public Arrays[] getProductId() {
		return productId;
	}
	
	public Order(int customerId,String customerName) {
		// TODO Auto-generated constructor stub
		this.orderId = cid;
		cid++;
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public int getOrderId() {
		return orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return this.orderDate.compareTo(o.getOrderDate());
	}
	
}
