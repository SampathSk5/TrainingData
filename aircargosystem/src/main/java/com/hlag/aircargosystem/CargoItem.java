package com.hlag.aircargosystem;

public abstract class CargoItem {

	protected String cargoId;

	public CargoItem(String cargoId) {
		this.cargoId = cargoId;
	}

	public abstract double calculateShippingCost();
}
