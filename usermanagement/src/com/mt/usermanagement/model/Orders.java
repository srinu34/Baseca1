package com.mt.usermanagement.model;

public class Orders 
{
private int or_id;
private int qty;
private Customer c_id;
private Products p_id;
public Orders() {
	super();
}
public Orders(int or_id, int qty, Customer c_id, Products p_id) {
	super();
	this.or_id = or_id;
	this.qty = qty;
	this.c_id = c_id;
	this.p_id = p_id;
}
public int getOr_id() {
	return or_id;
}
public void setOr_id(int or_id) {
	this.or_id = or_id;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Customer getC_id() {
	return c_id;
}
public void setC_id(Customer c_id) {
	this.c_id = c_id;
}
public Products getP_id() {
	return p_id;
}
public void setP_id(Products p_id) {
	this.p_id = p_id;
}


}
