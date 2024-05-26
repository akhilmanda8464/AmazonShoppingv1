package com.groupTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest2 {
		@Test(groups= {"smoke","functional","sanity"})
		public void test1() {
		System.out.println("test1");
		}
		@Test(groups= {"smoke","regression"})
		public void test2() {
			System.out.println("test2");
			
		}
		
		@Test(groups= {"functional","regression","windows.regression"})
		public void test3() {
			System.out.println("test3");
			
		}

}
