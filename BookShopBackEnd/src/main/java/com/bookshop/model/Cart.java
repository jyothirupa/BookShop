package com.bookshop.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*@Entity
public class Cart {

	@Id
	private int id;
	
	private double grandTotal;
	
	@OneToOne
	private Customer customer;
	
	@OneToMany
	private List<CartItem> cartItem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", grandTotal=" + grandTotal + ", customer=" + customer + ", cartItem=" + cartItem
				+ "]";
	}	
	
}
*/