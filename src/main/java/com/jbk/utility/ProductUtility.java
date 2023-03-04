package com.jbk.utility;

import java.util.Scanner;

import com.jbk.entity.Product;

public class ProductUtility {

	public static Product getProductFromUser() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Product Id :-");
		int ProductId = scanner.nextInt();

		System.out.println("Enter Product Name :-");
		String ProductName = scanner.next();

		System.out.println("Enter Product Price :-");
		double ProductPrice = scanner.nextDouble();

		System.out.println("Enter Product Qty :-");
		int ProductQty = scanner.nextInt();

		System.out.println("Enter Product Category :-");
		String ProductCategory = scanner.next();

		Product product = new Product(ProductId, ProductName, ProductPrice, ProductQty, ProductCategory);
		return product;

	}
}