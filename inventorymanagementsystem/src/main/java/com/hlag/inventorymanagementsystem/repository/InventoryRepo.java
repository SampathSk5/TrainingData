package com.hlag.inventorymanagementsystem.repository;

import java.util.List;
import java.util.UUID;

import com.hlag.inventorymanagementsystem.Product;

public interface InventoryRepo {

	public Product add(Product product);

	public Product get(UUID productID);

	public Product update(UUID productID, Product updatedProduct);

	public void delete(UUID productID);

	public List<Product> viewAllProducts();

	public void viewProductsSortedByName();

	public void viewProductsSortedByPrice();

}
