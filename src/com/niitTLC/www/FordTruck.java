package com.niitTLC.www;


public class FordTruck implements Truck {
	double weight;
	double axle;
	FordTruck(double axle,double weight)
	{
		this.weight=weight;
		this.axle=axle;
	}

	public double getWeight()
	{return weight;}
	@Override
	public double getAxles() {
		// TODO Auto-generated method stub
		return axle;
	}
}
