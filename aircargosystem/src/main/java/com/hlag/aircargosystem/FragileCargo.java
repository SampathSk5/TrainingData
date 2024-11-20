package com.hlag.aircargosystem;

public class FragileCargo extends Cargo {

	private String handlingInstructions;

	public FragileCargo(String cargoId, String description, int weight, String instructions) {
		super(cargoId, description, weight);
		this.handlingInstructions = instructions;
	}

	public void displayHandlingInstructions() {
		System.out.println("Handling Instructions: " + handlingInstructions);
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("This cargo is fragile. " + handlingInstructions);
	}

	@Override
	public double calculateShippingCost() {
		return super.calculateShippingCost() + 10;
	}
}
