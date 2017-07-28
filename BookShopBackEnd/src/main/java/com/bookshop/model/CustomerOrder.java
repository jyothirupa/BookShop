package com.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerOrder {

	@Id
	private int id;
	
	@ManyToOne
	private Customer customer;
	
	@OneToOne
	private Cart cart;
	
	@OneToOne
	private BillingAddress billingAddress;
	
	@OneToOne
	private ShippingAddress shippingAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	@Override
	public String toString() {
		return "CustomerOrder [id=" + id + ", customer=" + customer + ", cart=" + cart + ", billingAddress="
				+ billingAddress + ", shippingAddress=" + shippingAddress + "]";
	}
	
	
}
