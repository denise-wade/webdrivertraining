package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class WebDriverTest
{
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Setup...");
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}
	

	@AfterMethod
	public void cleanup()
	{
		System.out.println("Cleanup...");
		driver.quit();
	}
}
