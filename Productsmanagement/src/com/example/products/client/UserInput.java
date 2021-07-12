package com.example.products.client;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.products.dao.ProductImpl;
import com.example.products.model.Item;
import com.example.products.model.Products;
import com.example.products.service.ItemServiceImpl;
import com.example.products.service.ProductServicelmpl;

public class UserInput {

	public static void main(String[] args) {

		System.out.println("1.Add list of items:");
		System.out.println("2.Delete item:");
		Set<Products> products = new ProductServicelmpl().getProducts();
		List<Item> items = new ItemServiceImpl().getItem();
		items.forEach(a -> System.out.println(a));
		double average = items.stream().mapToDouble(i -> i.getPrice()).average().getAsDouble();
		System.out.println(average);
	}

}
