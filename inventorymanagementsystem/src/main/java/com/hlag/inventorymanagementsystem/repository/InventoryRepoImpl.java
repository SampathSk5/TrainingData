package com.hlag.inventorymanagementsystem.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.hlag.inventorymanagementsystem.Product;

public class InventoryRepoImpl implements InventoryRepo {

	private final List<Product> products = new ArrayList<>();

	@Override
	public Product add(Product product) {
		if (products.add(product)) {
			System.out.println("Product added: " + product);
			return product;
		}
		;
		return null;
	}

	@Override
	public Product get(UUID productID) {
		return products.stream().filter(product -> product.getProductID().equals(productID)).findFirst().orElse(null);
	}

	@Override
	public void delete(UUID productID) {
		Optional<Product> product = products.stream().filter(p -> p.getProductID().equals(productID)).findFirst();
		if (product.isPresent()) {
			products.remove(product.get());
			System.out.println("Product deleted: " + product.get());
		} else {
			System.out.println("Product not found with ID: " + productID);
		}
	}

	@Override
	public List<Product> viewAllProducts() {

		System.out.println("Product List sorted by price---->" + products);
		return products;
	}

	@Override
	public void viewProductsSortedByName() {
		products.stream().sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);
	}

	@Override
	public void viewProductsSortedByPrice() {
		products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
	}

	@Override
	public Product update(UUID productID, Product updatedProduct) {
		return updatedProduct;
	}
}
