package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://172.31.144.1:4444/";
    public Capabilities capabilities;
 
    @Parameters({"browser"})
    @BeforeMethod
    public void setDriver(String browser) throws MalformedURLException {
         
        System.out.println("Test is running on "+browser);
 
        if(browser.equals("firefox")) {
            capabilities = new FirefoxOptions();
        } else if (browser.equals("chrome")) {
            capabilities = new ChromeOptions();
        } else if (browser.equals("edge")) {
            capabilities = new EdgeOptions();
        }
 
        driver.set(new RemoteWebDriver(new URL(remote_url), capabilities));
        driver.get().get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ap_email\"]")));
    }
 
    public WebDriver getDriver() {
        return driver.get();
    }
 
    @AfterMethod
    public  void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }


	
	

}
