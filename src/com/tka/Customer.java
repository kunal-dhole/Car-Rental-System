package com.tka;

public class Customer {
private String customerid;
private	String name;
public Customer(String customerid, String name) {
	super();
	this.customerid = customerid;
	this.name = name;
}
public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", name=" + name + "]";
}
}
