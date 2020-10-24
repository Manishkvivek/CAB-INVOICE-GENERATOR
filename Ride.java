package com.CabInvoiceGenerator;

public enum Ride {
	
	public double distance;
	public int time;
	public CabRide rideType;

	Ride(double distance, int time, CabRide rideType) {
		this.distance = distance;
		this.time = time;
		this.rideType = rideType;
	}

}
