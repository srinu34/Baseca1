package com.shopingcart.client;

import java.util.Scanner;

import com.shopingcart.model.Customer;
import com.shopingcart.model.Products;

public class Userinput {
	static Scanner sc = new Scanner(System.in);
	static Products[] product = { new Products(1, "vollyball", 20), new Products(2, "bbb", 30) };

	public static void main(String[] args) {
		Customer[] c = { new Customer(1, "aaaa", null), new Customer(2, "bbbb", null) };
		int option = 0;
		do {
			System.out.println("1.Login:");
			System.out.println("0.Exit:");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Customer ID:");
				int id = sc.nextInt();
				Customer customer = validate(id, c);
				int choice = 0;
				if (customer != null) {
					Products[] product1 = null;
					do {
						showproduct(product);
						System.out.println("select Your product ID:");
						int pid = sc.nextInt();
						System.out.println("Enter the no of Quantity:");
						int qty = sc.nextInt();
						product1 = addProduct(product1, pid, qty);
						System.out.println("BUY more Enter 0 or press any key to Exit:");
						choice = sc.nextInt();

					} while (choice == 0);
					customer.setProducts(product1);
					c = updatecustomer(c, customer);
					int ch = 2;
					do {
						diaplay(customer);
						System.out.println("1.To remove product:");
						System.out.println("2.Exit:");
						ch = sc.nextInt();
						if (ch == 1) {
							System.out.println("Enter the product id to remove:");
							int pid = sc.nextInt();
							for (int i = 0; i < customer.getProducts().length; i++) {
								if (customer.getProducts()[i].getId() == pid) {
									customer.getProducts()[i] = null;
								}

							}

						} else if (ch == 2) {
							// diaplay(customer);
							System.out.println("===Thankyou for Visiting====");
						} else {
							System.out.println("Invalid option");
						}

					} while (ch != 2);

				} else {
					System.out.println("Customer Does Not Exits:");
				}
				break;
			case 0:
				System.out.println("========Thank you=========");
				break;
			default:
				System.out.println("=========Invalid Option========");
				break;
			}
		} while (option != 0);
	}

	private static void diaplay(Customer customer) {
		System.out.println("ID:" + customer.getId() + " Name :" + customer.getName());
		System.out.println("Products IN Cart:");
		double amount = 0;
		for (int i = 0; i < customer.getProducts().length; i++) {
			if (customer.getProducts()[i] != null) {
				System.out.println("Product ID:" + customer.getProducts()[i].getId() + " Name :"
						+ customer.getProducts()[i].getName() + " Quantity :" + customer.getProducts()[i].getQty()
						+ " price :" + customer.getProducts()[i].getPrice());
				amount += customer.getProducts()[i].getPrice();

			}
		}
		System.out.println("Total Amount :" + amount);

	}

	private static Customer[] updatecustomer(Customer[] c, Customer customer) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].getId() == customer.getId()) {
				c[i] = customer;
			}

		}
		return c;
	}

	private static Products[] addProduct(Products[] product1, int pid, int qty) {
		Products p;
		if (product1 == null) {
			product1 = new Products[1];
			p = product[pid - 1];
			p.setQty(qty);
			double price = p.getPrice() * qty;
			p.setPrice(price);
			product1[0] = p;

		} else {
			Products[] product2 = new Products[product1.length + 1];
			for (int i = 0; i < product1.length; i++) {
				product2[i] = product1[i];
			}
			p = product[pid - 1];
			p.setQty(qty);
			double price = p.getPrice() * qty;
			p.setPrice(price);
			product2[product2.length - 1] = p;
			product1 = product2;
		}
		return product1;
	}

	private static void showproduct(Products[] product) {
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
		}

	}

	private static Customer validate(int id, Customer[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].getId() == id)

				return c[i];
		}
		return null;
	}

}
