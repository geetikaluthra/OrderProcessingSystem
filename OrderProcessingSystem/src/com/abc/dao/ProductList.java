package com.abc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.abc.model.Product;

public class ProductList {
	private final List<Product> productList=new ArrayList<Product>();

	public List<Product> getProductList() {
		return productList;
	}

	public void productsInitialization(){
		Product p1=new Product();
		p1.setProductName("Toy");
		p1.setProductId(1);
		p1.setProductPrice(55.5);
		p1.setQuantity(5);
		
		Product p2=new Product();
		p2.setProductName("Laptop");
		p2.setProductId(2);
		p2.setProductPrice(20000);
		p2.setQuantity(15);
		
		Product p3=new Product();
		p3.setProductName("Desktop");
		p3.setProductId(3);
		p3.setProductPrice(10000);
		p3.setQuantity(3);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
	}
	
	public Boolean searchProductByName(String productName){
		Boolean found=false;
		Iterator<Product> itr=productList.iterator();
		while(itr.hasNext()){
			Product p=itr.next();
			if(p.getProductName().equalsIgnoreCase(productName)){
				System.out.println(p.getProductId()+" "+p.getProductName()+"   "+p.getProductPrice()+"   "+p.getQuantity()+" left");
				found=true;
			}

		}
		return found;
	}
	public Product searchProductById(int productId){
		Boolean found=false;
		Iterator<Product> itr=productList.iterator();
		while(itr.hasNext()){
			Product p=itr.next();
			if(p.getProductId()==productId){
				System.out.println(p.getProductId()+" "+p.getProductName()+"   "+p.getProductPrice()+"   "+p.getQuantity()+" left");
				return p;
			}

		}
		return null;
	}

}
