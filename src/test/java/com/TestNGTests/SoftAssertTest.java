package com.TestNGTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert.*;

public class SoftAssertTest {
	WebDriver driver;
	@Test
	public void Facebook_Test() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fhjfjhf",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SoftAssert softassert=new SoftAssert();
		
		//Title Assertion
		String Act_Title=driver.getTitle();
		String Exp_Title="Log in to Facebook";
		assertEquals(Act_Title,Exp_Title,"Title is Mismatched");
		
		//URL Assertion
				String Act_URL=driver.getCurrentUrl();
				String Exp_URL="https://www.facebook.com/login/2";
				assertEquals(Act_URL,Act_URL,"URL is Mismatched");
				
				//Text Assertion
				String Act_Text=driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
				String Exp_Text="";
				softassert.assertEquals(Act_Text,Exp_Text,"Username is Mismatched");
				
				//Border Assertion
				String Act_Border=driver.findElement(By.xpath("//*[@id=\"email\"]")).getCssValue("border");
				String Exp_Border="0.8px solid rgb(221, 223, 225)";
				softassert.assertEquals(Act_Border,Exp_Border,"Border is Mismatched");
				
				//errorMessage Assertion
				String Act_Error=driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[2]")).getText();
				String Exp_Error="Invalid username or password";
				assertEquals(Act_Error,Exp_Error,"Error is Mismatched");
				
				
		System.out.println(Act_Title);
		
		
		driver.quit();
		
	}

}
