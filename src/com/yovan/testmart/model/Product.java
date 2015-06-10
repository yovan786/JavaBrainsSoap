package com.yovan.testmart.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = { "price", "sku", "name" })
public class Product {
	private String name;
	private String sku;
	private double price;

	public Product() {
		super();
	}

	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name = "ProductName", nillable = false, defaultValue = "No Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "SKU", nillable = true)
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name = "ProductName", defaultValue = "0.0")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", sku=" + sku + ", price=" + price
				+ "]";
	}

}
