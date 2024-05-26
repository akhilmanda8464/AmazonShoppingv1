package com.TestNGTests;

import org.testng.annotations.Test;

public class TestDependency {
	static String trackingNumber=null;
	@Test
	public void CreateShipment() {
		System.out.println("CreateShipment");
		trackingNumber="AB13NX";
		
	}
	

}
