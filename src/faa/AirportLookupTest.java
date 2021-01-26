package faa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class AirportLookupTest
{
	private WebDriver driver;
	private JavascriptExecutor js;
	private WebDriverWait wait;

	@Test
	public void airportLookup() throws InterruptedException
	{
		driver.get("https://www.faa.gov/");
		driver.manage().window().maximize();
		js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.id("airportCode")).sendKeys("GPI");
		driver.findElement(By.id("checkAirport")).click();
		
		
		By checkAirport = By.id("checkAirport");
		WebElement checkAirportButton = driver.findElement(checkAirport);
		checkAirportButton.click();
		
		
		
		Thread.sleep(3000);
		
		String airportName = driver.findElement(By.cssSelector(".airportInfo b")).getText();	
		System.out.println("airportName: " + airportName);
	}
  
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
