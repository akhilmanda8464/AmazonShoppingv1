package Grid;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SeleniumforParallelDemo extends BaseTest {
	@Test
	public void validCredentials() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8464918972");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rhea@2024");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newPagetext=getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("newPagetext:"+newPagetext);
		assertEquals(newPagetext,"Hello, Akhil");
		
	}

}
