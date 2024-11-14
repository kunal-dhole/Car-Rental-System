package com.tka;

import java.util.Scanner;

public class Car {
  int id;
  String companyNmae;
  String carName;
  int rentProce;
  
public Car(int id, String companyNmae, String carName, int rentProce) {
	super();
	this.id = id;
	this.companyNmae = companyNmae;
	this.carName = carName;
	this.rentProce = rentProce;
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyNmae() {
	return companyNmae;
}
public void setCompanyNmae(String companyNmae) {
	this.companyNmae = companyNmae;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public int getRentProce() {
	return rentProce;
}
public void setRentProce(int rentProce) {
	this.rentProce = rentProce;
}
@Override
public String toString() {
	return "Car [id=" + id + ", companyNmae=" + companyNmae + ", carName=" + carName + ", rentProce=" + rentProce + "]";
}


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
public String toString1() {
	return "Rental [car=" + car + ", customer=" + customer + ", days=" + days + "]";
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
private Car car;
private Customer customer;
private int days;
public void Rental(Car car, Customer customer, int days) {
this.car = car;
this.customer = customer;
this.days = days;
}
public void menu() {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Car Rental System");
		System.out.println("1. Rent a Car");
		System.out.println("2.Return a Car");
		System.out.println("3.Exit");
		
		System.out.println("Enter youe choice:");
	     
		int choice=sc.nextInt();
		sc.nextLine();
		
		if(choice==1) {
			
		}
	}
}






}



