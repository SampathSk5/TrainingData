package com.hlag.aircargosystem;

public class Main {

	public static void main(String[] args) {
		Cargo cargo1 = new Cargo("C001", "Books", 50);
		FragileCargo cargo2 = new FragileCargo("C002", "Glassware", 30, "Handle with care.");
		cargo1.displayDetails();
		System.out.println("Shipping Cost: " + cargo1.calculateShippingCost(100));
		cargo1.trackCargo();
		cargo2.displayDetails();
		System.out.println("Shipping Cost: " + cargo2.calculateShippingCost());
		cargo2.displayHandlingInstructions();
		cargo2.trackCargo();
	}

}
