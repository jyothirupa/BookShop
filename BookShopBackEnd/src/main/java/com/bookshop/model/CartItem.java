package com.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/*
@Entity
public class CartItem {
	
	@Id
	private int id;
	
	private int quantity;
	private double totalPrice;
	
	@OneToMany
	private Book book;
	
	@ManyToOne
	private Cart cart;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", book=" + book
				+ ", cart=" + cart + "]";
	}

}
*/