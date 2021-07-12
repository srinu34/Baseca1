package com.example.products.service;

import java.util.List;
import java.util.Set;

import com.example.products.dao.ProductImpl;
import com.example.products.model.Products;

public class ProductServicelmpl implements ProductServiceDao {

//	@Override
//	public Set<Products> addProduct(Set<Products> products, Products product) {
//		return new ProductImpl().addProduct(products, product);
//	}
//
//	@Override
//	public Set<Products> deleteProduct(Set<Products> products, Products product) {
//		return null;
//	}

	@Override
	public Set<Products> getProducts() {
		return new ProductImpl().getProducts();
	}

	
}
