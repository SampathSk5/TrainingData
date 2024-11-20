package com.hlag.inventorymanagementsystem.service;

import java.util.List;
import java.util.UUID;

import com.hlag.inventorymanagementsystem.Product;

public class InventoryServiceImpl implements InventoryService {

	private static InventoryServiceImpl inventoryService;

	public static InventoryServiceImpl getInstance() {
		if (inventoryService == null) {
			inventoryService = new InventoryServiceImpl();
		}
		return inventoryService;
	}

	@Override
	public Product add(Product product) {

		return inventoryService.add(product);
	}

	@Override
	public Product get(UUID productID) {
		// TODO Auto-generated method stub
		return inventoryService.get(productID);
	}

	@Override
	public Product update(UUID productID, Product updatedProduct) {
		// TODO Auto-generated method stub
		return inventoryService.update(productID, updatedProduct);
	}

	@Override
	public void delete(UUID productID) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return inventoryService.viewAllProducts();
	}

	@Override
	public void viewProductsSortedByName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewProductsSortedByPrice() {
		// TODO Auto-generated method stub

	}

}
