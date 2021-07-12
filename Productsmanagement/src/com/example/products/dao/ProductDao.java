package com.example.products.dao;

import java.util.List;
import java.util.Set;

import com.example.products.model.Item;
import com.example.products.model.Products;


public interface ProductDao {
public Set<Products> addProduct(Set<Products> products, Products product);
public Set<Products> deleteProduct(Set<Products> products, Products product);
public Set<Products> getProducts();	

}
