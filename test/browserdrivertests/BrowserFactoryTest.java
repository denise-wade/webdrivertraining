package browserdrivertests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import webdrivertraining.BrowserFactory;

public class BrowserFactoryTest
{
	@Test
	public void testCreateDefaultDriver()
	{
		WebDriver driver = new BrowserFactory().getDriver();
		driver.get("https://one-shore.com");
		driver.quit();
	}

	@Test
	public void testCreateChromeDriver()
	{
		WebDriver driver = new BrowserFactory().getDriver("Chrome");
		driver.get("https://one-shore.com");
		driver.quit();
	}
	
	@Test
	public void testCreateFirefoxDriver()
	{
		WebDriver driver = new BrowserFactory().getDriver("firefox");
		driver.get("https://one-shore.com");
		driver.quit();
	}
	
	@Test
	public void testCreateEdgeDriver()
	{
		WebDriver driver = new BrowserFactory().getDriver("edge");
		driver.get("https://one-shore.com");
		driver.quit();
	}
	
	@Test
	public void testCreateIEDriver()
	{
		WebDriver driver = new BrowserFactory().getDriver("IE");
		driver.get("https://one-shore.com");
		driver.quit();
	}
}