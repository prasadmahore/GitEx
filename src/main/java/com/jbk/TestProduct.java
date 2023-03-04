package com.jbk;

import java.util.Scanner;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;
import com.jbk.utility.ProductUtility;

public class TestProduct {
	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();

		Scanner scanner = new Scanner(System.in);
		int choice;
		char ch;

		do {

			System.out.println("Press 1 for save Product");
			System.out.println("Press 2 For get Product");

			choice = scanner.nextInt();
			switch (choice) {
			case 1: {

				Product Product = ProductUtility.getProductFromUser();
				String msg = productDao.saveProduct(Product);
				System.out.println(msg);

				break;

			}
			case 2: {
				System.out.println("Enter Product Id :-");
				int id = scanner.nextInt();
				Product product = productDao.getProductById(id);
				System.out.println(product);

				break;

			}

			default:
				System.out.println("Invalid choice !!");
				break;
			}

			System.out.println("Do you want to continue y/n !!");
			ch = scanner.next().charAt(0);

		} while (ch != 'n' & ch != 'N');
		System.out.println("Terminated");

	}

}
