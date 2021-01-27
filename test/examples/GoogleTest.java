package examples;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		// arrange
		System.out.println("Setup...");
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void searchForSelenium() throws InterruptedException
	{
		System.out.println("Test...");
		// act
		
		// find the search box
		WebElement searchbox = driver.findElement(By.cssSelector("input[name=q]"));
		
		// type selenium in search box
		searchbox.sendKeys("selenium");
		
		Thread.sleep(1000);
		// submit
		WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
		searchButton.click();
		
		// assert
		// check results
		List<WebElement> searchResults = driver.findElements(By.cssSelector("#rso > div"));
		System.out.println(searchResults.size());
		String firstResult = searchResults.get(0).getText();
		System.out.println(firstResult);
		
		assertTrue(firstResult.contains("Selenium"));
	}
	
	@AfterMethod
	public void cleanup()
	{
		driver.quit();
	}
}
