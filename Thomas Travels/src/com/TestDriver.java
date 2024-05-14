package com;

import java.util.ArrayList;

public class TestDriver {

	private static ArrayList<Driver> driversList = new ArrayList<Driver>();

	private static ArrayList<Driver> preparedTestData() {
		Driver driver1 = new Driver(1, "Sravan", "car", 2165.5);
		Driver driver2 = new Driver(2, "Uday", "Lorry", 651.25);
		Driver driver3 = new Driver(3, "Rohith", "car", 9846.64);
		Driver driver4 = new Driver(4, "Karthik", "Areoplane", 2165.49);
		Driver driver5 = new Driver(5, "Yashwanth", "Cycle", 98455.1);

		driversList.add(driver1);
		driversList.add(driver2);
		driversList.add(driver3);
		driversList.add(driver4);
		driversList.add(driver5);
		
		return driversList;
	}
	public static void main(String[] args) {
		ArrayList<Driver> driversDetails = preparedTestData();
		Travel travelObject = new Travel();
		System.out.println("1)Is he a Car Driver ? " + travelObject.isCarDriver(driversDetails.get(0)));
		System.out.println("2)Details By ID : "+travelObject.retrievebyDriverId(driversDetails, 1));
		String category="car";
		System.out.println("3)How many Drivers travelling through " + category +  " : "
					+ travelObject.retrieveCountOfDriver(driversDetails, category));
		System.out.println("4)Details Of the Drivers travelling though " + category +  " : "
				+ travelObject.retrieveDriver(driversDetails, category));
		System.out.println("5)Who travelled Maximum Distance ? " + travelObject.retrieveMaximumDistanceTravelledDriver(driversDetails));
	}

	

}
