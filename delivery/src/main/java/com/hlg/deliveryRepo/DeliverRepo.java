package com.hlg.deliveryRepo;

import java.util.List;
import java.util.Optional;

import com.hlag.delivery.Delivery;

public interface DeliverRepo {

	// Save a new delivery
	void save(Delivery delivery);

	// Find a delivery by its ID
	Optional<Delivery> findById(String deliveryId);

	// Get all deliveries
	List<Delivery> findAll();

	// Update an existing delivery
	void update(Delivery delivery);

	// Delete a delivery by its ID
	void deleteById(String deliveryId);

	// Get deliveries that are completed
	List<Delivery> findCompletedDeliveries();

	public List<Delivery> Threshold(double threshold);

	public List<Delivery> markDeliveriesAsCompleted();

	public void removeDeliveriesByCompletedAsDelivery();

	public double calculateTotalRevenue();

	public double averageDeliveryTime();

	public List<Delivery> findTopKPerformingDeliveries(int k);

}
