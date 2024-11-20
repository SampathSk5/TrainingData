package com.hlag.shipment;

public class ShipmentFactory {

	// Factory method to create Shipment objects
	public static Shipment createShipment(String shipmentType) {
		switch (shipmentType.toLowerCase()) {
			case "air":
				return new AirShipment();
			case "sea":
				return new SeaShipment();
			case "land":
				return new LandShipment();
			default:
				throw new IllegalArgumentException("Invalid shipment type: " + shipmentType);
		}
	}

}
