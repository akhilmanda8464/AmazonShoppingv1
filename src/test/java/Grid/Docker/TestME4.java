package Grid.Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestME4 {
	public static WebDriver driver;
	@Test
	public void test4() throws MalformedURLException {
		String nodeURL="http://172.31.144.1:4444";
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("edge");
		dc.setPlatform(Platform.LINUX);
		driver=new RemoteWebDriver(new URL(nodeURL),dc);
		
		driver.get("https://staragile.melimu.com/login/index.php?id=1&code=Star%20Agile");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
