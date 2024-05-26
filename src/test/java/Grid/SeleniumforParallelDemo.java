package Grid;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SeleniumforParallelDemo extends BaseTest {
	@Test
	public void validCredentials() {
		getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8464918972");
		getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
		getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rhea@2024");
		getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		String newPagetext=getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
		System.out.println("newPagetext:"+newPagetext);
		assertEquals(newPagetext,"Hello, Akhil");
		
	}

}
