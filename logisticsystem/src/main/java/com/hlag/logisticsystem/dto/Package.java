package com.hlag.logisticsystem.dto;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Package {

	private final String trackingId;
	private double weight;
	private String destination;
	private String status;
	private List<String> milestones;

	public String getTrackingId() {
		return trackingId;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStatus() {
		return status;
	}

	public List<String> getMilestones() {
		return Collections.unmodifiableList(milestones);
	}

	public void markasDeliverd(String status) {

		// in transist
		if (this.status.equals(status)) {
			throw new IllegalArgumentException("Package in transist");
		}
		this.status = "deliverd";
		this.milestones.add("deliverd on" + LocalDate.now());
	}

	// public Package(String trackingId, String destination, double weight) {
	// super();
	// this.trackingId = trackingId;
	// this.destination = destination;
	// this.status = "In Transit"; // Initial status
	// this.milestones = new ArrayList<>();
	// setWeight(weight);
	// }
	//
	// public Package() {
	// this.trackingId = "";
	// }

	public Package() {
		this.trackingId = "";
	}

	public static Package pack;

	public static Package getInstance() {
		if (pack == null) {
			pack = new Package();
		}
		return pack;

	}

}
