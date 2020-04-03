package com.niitTLC.www;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTollTest {
	private CalculateTollTest calc;
	private NissanTruck n;
	TollBooth a = new AlleghenyTollBooth();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		n = new  NissanTruck(2,5000);
		a.calculateToll(n);
		
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		n= null;
	}
	

	
	@Test
	public void testcalculate() {
		double result = a.calculateToll(n);
		assertEquals(120, result , 60);
	}
	

	
}
