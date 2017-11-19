package com.abc.dao;

import java.util.Calendar;
import java.util.TreeSet;

import com.abc.model.Customer;
import com.abc.model.Order;
import com.abc.model.Product;

public class Orders{
	private TreeSet<Order> orderList=new TreeSet<Order>();

	public TreeSet<Order> getOrderList() {
		return orderList;
	}

	public Boolean addNewProduct(Customer c,Product p,int quantity){
		boolean productAddesd=false;
		if(quantity<p.getQuantity()){
			Order o=new Order(c.getId(),c.getName());
			Calendar cal=Calendar.getInstance();
			o.setOrderDate(cal.getTime());
			o.setAmount(o.getAmount()+(quantity*p.getProductPrice()));
			p.setQuantity(p.getQuantity()-quantity);
			productAddesd=true;
			orderList.add(o);
			//System.out.println("Place Order");
		}
	return productAddesd;		
	}
	
	
	public void deleteExistingProduct(int orderId,int pId){
		
	}
	
}
