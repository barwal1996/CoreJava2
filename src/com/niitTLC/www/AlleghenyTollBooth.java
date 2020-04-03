package com.niitTLC.www;
public class AlleghenyTollBooth implements TollBooth {
	int trucksSinceCollection ;
	double receiptsSinceCollection;
	AlleghenyTollBooth()
	{
		trucksSinceCollection = 0;
		receiptsSinceCollection = 0;
	}
	@Override
	public double calculateToll(final  Truck truck) {
		double axles = truck.getAxles();
		double totalWeight = truck.getWeight();
		double tollDue = 5*axles + 10*(totalWeight/1000); // Toll calculation
		System.out.print("Truck arrival - axles: ");
		System.out.print(axles);
		System.out.print(" totalWeight: ");
		System.out.print(totalWeight);
		System.out.print(" Toll due: ");
		System.out.println(tollDue);
		trucksSinceCollection = trucksSinceCollection + 1;
		return receiptsSinceCollection = receiptsSinceCollection + tollDue;

	}

	@Override
	public void onReceiptCollection() {

		System.out.print("*** Collecting receipts ***");
		displayData();
		trucksSinceCollection = 0; // Clear out totals
		receiptsSinceCollection = 0;
		}
		public void displayData() {
		System.out.print("Totals since last collection - Receipts: ");
		System.out.print(receiptsSinceCollection);
		System.out.print(" Trucks: ");
		System.out.println(trucksSinceCollection);
		}	
	}


