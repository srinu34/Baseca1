package com.example.products.service;

import java.util.List;
import java.util.Set;

import com.example.products.dao.ItemImpl;
import com.example.products.model.Item;

public class ItemServiceImpl  implements ItemServiceDao{

	@Override
	public List<Item> getItem() {
		return new ItemImpl().getItem();
	}

}
