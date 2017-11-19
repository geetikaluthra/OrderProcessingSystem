package com.abc.main;

import java.util.List;
import java.util.Scanner;

import com.abc.dao.Orders;
import com.abc.dao.ProductList;
import com.abc.model.Customer;
import com.abc.model.Order;
import com.abc.model.Product;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		String ans;
		Scanner sc=new Scanner(System.in);
		ProductList l=new ProductList();
		Orders o=new Orders();
		Customer cust=customerDetails();
		l.productsInitialization();
		int choice;
		
		do{
			System.out.println("WELCOME !!!");
			System.out.println("Enter your choice");
			System.out.println("1.View Products");
			System.out.println("2.Edit Address");
			System.out.println("3.Edit Phone Number");
			System.out.println("4.Search Product");
			System.out.println("5.Add new Product");
			System.out.println("6.Delete product");
			System.out.println("7.Sort order list based on date");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					List<Product> products=l.getProductList();
					System.out.println("Product List:");
					System.out.println("Id"+" "+"Name"+" "+"Price"+"  "+"Quantity");
					for(Product p:products)
						System.out.println(p.getProductId()+" "+p.getProductName()+"   "+p.getProductPrice()+"   "+p.getQuantity()+" left");
					break;
				case 2:
					System.out.println("Enter your new Address");
					cust.editAddress(sc.next());
					break;
				case 3:
					System.out.println("Enter your new phone number");
					cust.editPhone(sc.nextLong());
					break;
				case 4:
					System.out.println("1.By Name");
					System.out.println("2.By Id");
					int internalChoice=sc.nextInt();
					String pName;
					int pId;
					switch(internalChoice){
					case 1:
							System.out.println("Enter Product Name");
							pName=sc.next();
							if(!l.searchProductByName(pName))
								System.out.println("No product found");
							break;
							
					case 2:
						System.out.println("Enter Product Id");
						pId=sc.nextInt();
						if(l.searchProductById(pId).equals(null))
							System.out.println("No product found");
						break;
						
					default:
							System.out.println("Please enter the correct response");
					}
					break;
				case 5:
					do{
					List<Product> productList=l.getProductList();
					int option;
					for(Product p:productList)
						System.out.println(p.getProductId()+" "+p.getProductName()+"   "+p.getProductPrice()+"   "+p.getQuantity()+" left");
					System.out.println("Which product do you wanna add?");
					option=sc.nextInt();
					Product p=l.searchProductById(option);
					System.out.println("Quantity");
					int q=sc.nextInt();
					if(o.addNewProduct(cust,p,q))
						System.out.println("Product added");
					else
						System.out.println("Product not added.Please check the number of items left");
					System.out.println("Do you wanna add more items(y/n)");
					ans=sc.next();
					}while(ans.equalsIgnoreCase("y"));
					
					break;
				case 6:
					break;
				case 7:
					for(Order o1:o.getOrderList())
						System.out.println(o1.getAmount()+" "+o1.getOrderId()+o1.getOrderDate());
					break;
				default:
						
			}
			System.out.println("Do you wanna continue(Y/N");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));	
	}
	
	public static Customer customerDetails(){
		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter your name");
		c.setName(s.next());
		System.out.println("Enter your Address");
		c.setAddress(s.next());
		System.out.println("Enter your phone number");
		c.setPhone(s.nextLong());
		return c;
	}

}
