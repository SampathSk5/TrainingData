package com.hlag.inventorymanagementsystem;

import java.util.Scanner;
import java.util.UUID;

import com.hlag.inventorymanagementsystem.service.InventoryService;
import com.hlag.inventorymanagementsystem.service.InventoryServiceImpl;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);
	static Product product = new Product("Book", "BookDetails", 150, 2);
	static Product product2 = new Product("pen", "BookDetails", 60, 2);
	static Product product3 = new Product("Note", "BookDetails", 70, 2);

	static InventoryService inventoryService = InventoryServiceImpl.getInstance();

	public static void main(String[] args) {
		boolean exit = false;

		while (!exit) {
			int choice = scanner.nextInt();
			scanner.nextLine();

			try {
				switch (choice) {
					case 1:
						inventoryService.add(product);
						System.out.println("Product added: " + product);
						break;

					case 2:
						System.out.print("Enter Product ID to update: ");
						UUID productIdToUpdate = UUID.fromString(scanner.nextLine());
						System.out.print("Enter new name: ");
						String newName = scanner.nextLine();
						System.out.print("Enter new description: ");
						String newDescription = scanner.nextLine();
						System.out.print("Enter new price: ");
						double newPrice = scanner.nextDouble();
						System.out.print("Enter new quantity: ");
						int newQuantity = scanner.nextInt();
						scanner.nextLine(); // Consume newline

						Product updatedProduct = new Product(newName, newDescription, newPrice, newQuantity);
						inventoryService.update(productIdToUpdate, updatedProduct);
						System.out.println("Product updated.");
						break;

					case 3:
						System.out.print("Enter Product ID to delete: ");
						UUID productIdToDelete = UUID.fromString(scanner.nextLine());
						inventoryService.delete(productIdToDelete);
						System.out.println("Product deleted.");
						break;

					case 4:
						System.out.println("Exiting...");
						exit = true;
						break;

					default:
						System.out.println("Invalid option. Please try again.");
						break;
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
