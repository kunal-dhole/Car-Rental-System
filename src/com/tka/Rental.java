package com.tka;

public class Rental {
	
@Override
	public String toString() {
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
public Rental(Car car, Customer customer, int days) {
	super();
	this.car = car;
	this.customer = customer;
	this.days = days;
}



}
