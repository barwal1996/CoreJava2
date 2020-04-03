package com.niitTLC.www;


public class TestTollBooth {
	public static void main(String[] args) {
		// Create the tollbooth
		TollBooth booth = new AlleghenyTollBooth();
		// Now for some trucks
		Truck truck1 = new NissanTruck(5, 12000);
		Truck truck2 = new FordTruck(2, 5000);
		DaewooTruck truck3 = new DaewooTruck(6, 17000);

		// Let's start collecting tolls!
		booth.calculateToll(truck1);
		booth.displayData();
		booth.calculateToll(truck2);

		// Time to collect the receipts
		booth.onReceiptCollection();

		// Here comes another truck
		booth.calculateToll(truck2);
		booth.displayData();
	}
}
