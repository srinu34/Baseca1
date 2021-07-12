package com.example.products.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.products.model.Item;
import com.example.products.model.Products;

public class ProductImpl implements ProductDao {
//
//	@Override
////	public Set<Products> addProduct(Set<Products> products, Products product) {
////		if (products.contains(product)) {
////			return products;
////		} else {
////			products.add(product);
////			return products;
////		}
//	}
//  
//@Override
//public Set<Products> deleteProduct(Set<Products> products, Products product) {
////	if (products.contains(product)) {
////		products.remove(product);
////		return products;
////	} else {
////		products.add(product);
////		return products;
////	}
//}

@Override
public Set<Products> getProducts() {
	Set<Products> products=new HashSet<>();
	products.add(new Products(1,"moto E4 plus",10000,"mobile"));
	products.add(new Products(2,"mi",8000,"mobile"));
	products.add(new Products(3,"lenovo",9000,"mobile"));
	return products;	
}

@Override
public Set<Products> addProduct(Set<Products> products, Products product) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Set<Products> deleteProduct(Set<Products> products, Products product) {
	// TODO Auto-generated method stub
	return null;
}

}
