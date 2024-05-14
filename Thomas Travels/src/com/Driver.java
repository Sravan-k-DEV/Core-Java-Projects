package com;

public class Driver {
	private int driverId;
	private String driverName;
	private String category;
	private double totalDistance;
	
	public Driver() {
		
	}
	public Driver(int driverId, String driverName, String category, double totalDistance) {
		this.driverId=driverId;
		this.driverName=driverName;
		this.category=category;
		this.totalDistance=totalDistance;
	}
	public int getDriverId() {
		return this.driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId=driverId;
	}
	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName=driverName;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public double getTotalDistance() {
		return this.totalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		this.totalDistance=totalDistance;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category +
				", totalDistance=" + totalDistance + "]";
	}

}
