package com.niitTLC.www;

public class DaewooTruck implements Truck {
	double weight;
	double axle;
	DaewooTruck(double axles,double weight)
	{
		this.weight=weight;
		this.axle=axle;
	}

	public DaewooTruck(int axles2, int weight2) {
		// TODO Auto-generated constructor stub
	}

	public double getWeight()
	{return weight;}
	@Override
	public double getAxles() {
		// TODO Auto-generated method stub
		return axle;
	}
}

