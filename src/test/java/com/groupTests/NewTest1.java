package com.groupTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Test(groups= {"all"})
public class NewTest1 {
	@Test(groups= {"smoke"})
	public void test1() {
	System.out.println("test1");
	}
	@Test(groups= {"smoke","sanity"})
	public void test2() {
		System.out.println("test2");
		
	}
	@Test(groups= {"smoke","sanity","regression"})
	public void test3() {
		System.out.println("test3");
		
	}
	@Test(groups= {"smoke","sanity","functional"})
	public void test4() {
		System.out.println("test4");
		
	}
	@Test
	public void test5() {
		System.out.println("test5");
		
	}
	@Test
	public void test6() {
		System.out.println("test6");
		
	}

}
