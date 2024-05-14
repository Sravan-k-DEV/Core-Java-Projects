package com;

import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver drivers) {
		
		return drivers.getCategory().equalsIgnoreCase("Car");
		
	}
	public String retrievebyDriverId(ArrayList<Driver> driversList, int driverId) {
		for (Driver driver : driversList) {
			if(driver.getDriverId() == driverId) {
				return "Driver name is " + driver.getDriverName() + ", Belonging to the category " 
						+ driver.getCategory() + " traveled " + driver.getTotalDistance() 
						+ " KM so far.";
			}
		}
		return "No Driver Found *NULL*";
	}
	public int retrieveCountOfDriver(ArrayList<Driver> driversList, String category) {
		int numberOfDrivers=0;
		for (Driver driver : driversList) {
			if (driver.getCategory().equalsIgnoreCase(category)) {
				numberOfDrivers++;
			}
		}
		return numberOfDrivers;
	}
	
	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> driversList, String category){
		ArrayList<Driver> categorySpecificDriver=new ArrayList<Driver>();
		for (Driver driver : driversList) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				categorySpecificDriver.add(driver);
			}
		}
		return categorySpecificDriver;
	}
	
	
	public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> driversList) {
		Driver maxDistanceDriver = null;
		double maxDistance=0.0;
		for (Driver driver : driversList) {
			if(driver.getTotalDistance()>maxDistance) {
			maxDistance=driver.getTotalDistance();	
			maxDistanceDriver=driver;
			}
		}
		
		return maxDistanceDriver;
	}
	
}
