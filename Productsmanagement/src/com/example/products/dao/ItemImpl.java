package com.example.products.dao;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.products.model.Item;
import com.example.products.model.Products;

public class ItemImpl implements IteamDao {

	@Override
	public List<Item> getItem() {
		Set<Products> products = new ProductImpl().getProducts();
		List<Item> item = products.stream()
				.map(product -> new Item(product.getId(), product.getName(), product.getPrice()))
				.collect(Collectors.toList());
		return item;
	}

}
