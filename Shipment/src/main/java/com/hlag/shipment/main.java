package com.hlag.shipment;

public class main {

	public static void main(String[] args) {
		// Create different shipments using the factory
		Shipment airShipment = ShipmentFactory.createShipment("air");
		Shipment seaShipment = ShipmentFactory.createShipment("sea");
		Shipment landShipment = ShipmentFactory.createShipment("land");

		// Deliver the shipments
		airShipment.deliver();
		seaShipment.deliver();
		landShipment.deliver();
	}

}
