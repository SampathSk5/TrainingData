package com.halg.product;

class Product {

	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

// Scenario: Grouping products by price range and
// calculating total value per range
// We want to:
// Group products into price ranges (<50, 50-100, >100).
// Use a custom collector to compute the total
// value of products in each range.

