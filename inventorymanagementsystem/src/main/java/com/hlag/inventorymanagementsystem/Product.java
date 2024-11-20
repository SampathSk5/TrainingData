package com.hlag.inventorymanagementsystem;

import java.util.UUID;

import com.hlag.exception.InvalidDataException;

public class Product {

	private final UUID productID;
	private String name;
	private String description;
	private double price;
	private int quantity;

	public Product(String name, String description, double price, int quantity) {
		this.productID = UUID.randomUUID();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public UUID getProductID() {
		return productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidDataException {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new InvalidDataException("Price cannot be negative.");
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) throws InvalidDataException {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			throw new InvalidDataException("Quantity cannot be negative.");
		}
	}

	@Override
	public String toString() {
		return "Product ID: " + productID + ", Name: " + name + ", Description: " + description + ", Price: $" + price
				+ ", Quantity: " + quantity;
	}
}
