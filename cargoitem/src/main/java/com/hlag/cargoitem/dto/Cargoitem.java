package com.hlag.cargoitem.dto;

public class Cargoitem {

	private double weight;
	private double dimensions;
	private String type;

	public Cargoitem(double weight, double dimensions, String type) {
		this.weight = weight;
		this.dimensions = dimensions;
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public double getDimensions() {
		return dimensions;
	}

	public String getType() {
		return type;
	}

	public double calculateShippingCost() {
		double baseRate = 10.0;
		double cost = baseRate * weight;

		if ("value1".equals(type)) {
			cost = cost + 20;
		} else if ("value2".equals(type)) {
			cost = cost + 15;
		}
		return cost;
	}
}
