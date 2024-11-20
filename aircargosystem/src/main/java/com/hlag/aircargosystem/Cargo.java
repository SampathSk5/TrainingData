package com.hlag.aircargosystem;

public class Cargo extends CargoItem implements Trackable {

	private String description;
	protected int weight;

	public Cargo(String cargoId, String description, int weight) {
		super(cargoId);
		this.description = description;
		this.weight = weight;
	}

	public void displayDetails() {
		System.out.println("Cargo ID: " + cargoId + ", Description: " + description + ", Weight: " + weight);
	}

	public String getCargoId() {
		return cargoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight must be positive.");
		}
	}

	@Override
	public double calculateShippingCost() {
		return weight * 2.5;
	}

	public double calculateShippingCost(double distance) {
		return weight * distance * 0.05;
	}

	@Override
	public void trackCargo() {
		System.out.println("Tracking cargo ID: " + cargoId);
	}
}
