package com.hlag.shipment;


public class AirShipment implements Shipment {

	@Override
	public void deliver() {
		System.out.println("Delivering by air.");
	}

}
