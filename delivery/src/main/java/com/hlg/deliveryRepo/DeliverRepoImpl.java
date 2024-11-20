package com.hlg.deliveryRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hlag.delivery.Delivery;

public class DeliverRepoImpl implements DeliverRepo {

	private List<Delivery> deliveries = new ArrayList<>();

	// Save a new delivery
	@Override
	public void save(Delivery delivery) {
		// deliveries.add(delivery);
	}

	// Find a delivery by its ID
	@Override
	public Optional<Delivery> findById(String deliveryId) {
		return deliveries.stream().filter(delivery -> delivery.getDeliveryId().equals(deliveryId)).findFirst();
	}

	// Get all deliveries
	@Override
	public List<Delivery> findAll() {
		return new ArrayList<>(deliveries);
	}

	// Update an existing delivery
	@Override
	public void update(Delivery delivery) {
		Optional<Delivery> existingDelivery = findById(delivery.getDeliveryId());
		if (existingDelivery.isPresent()) {
			deliveries.remove(existingDelivery.get());
			deliveries.add(delivery);
		}
	}

	// Delete a delivery by its ID
	@Override
	public void deleteById(String deliveryId) {
		deliveries.removeIf(delivery -> delivery.getDeliveryId().equals(deliveryId));
	}

	// Get deliveries that are completed
	@Override
	public List<Delivery> findCompletedDeliveries() {
		// List<Delivery> completedDeliveries = new ArrayList<>();
		// for (Delivery delivery : deliveries) {
		// if (delivery.isCompleted()) {
		// completedDeliveries.add(delivery);
		// }
		// }
		// return completedDeliveries;
		return deliveries.stream().filter(delivery -> delivery.isCompleted()).collect(Collectors.toList());
	}

	@Override
	public List<Delivery> Threshold(double revenue) {
		return deliveries.stream().filter(delivery -> delivery.getRevenue() > 50).collect(Collectors.toList());

	}

	@Override
	public List<Delivery> markDeliveriesAsCompleted() {
		return deliveries.stream().filter(delivery -> delivery.isCompleted() == false).map(delivery -> {
			delivery.setCompleted(true);
			return delivery;
		}).collect(Collectors.toList());
	}

	@Override
	public void removeDeliveriesByCompletedAsDelivery() {
		List<Delivery> completedDeliveries = new ArrayList<>();
		completedDeliveries.removeIf(d -> d.isCompleted());
	}

	@Override
	public double calculateTotalRevenue() {
		return deliveries.stream().mapToDouble(e -> e.getRevenue()).sum();
	}

	@Override
	public double averageDeliveryTime() {
		return deliveries.stream().mapToDouble(e -> e.getDeliveryTimeInHours()).average().getAsDouble();
	}

	@Override
	public List<Delivery> findTopKPerformingDeliveries(int k) {
    return deliveries.stream().filter(e->e.isCompleted())
				.sorted((d1, d2) -> Double.compare(d2.getDeliveryTimeInHours(), d1.getDeliveryTimeInHours()))
				.limit(k)
				.collect(Collectors.toList());
	}
}
