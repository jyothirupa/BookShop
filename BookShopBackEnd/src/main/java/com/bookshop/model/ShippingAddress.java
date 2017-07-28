package com.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShippingAddress {
	
	@Id
	private int id;
	
	private int doorno;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ShippingAddress [id=" + id + ", doorno=" + doorno + ", street=" + street + ", area=" + area + ", city="
				+ city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
