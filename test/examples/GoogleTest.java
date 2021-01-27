package examples;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GoogleTest extends WebDriverTest
{
	@Test
	public void searchForSelenium() throws InterruptedException
	{
		// arrange
		driver.get("https://google.com");
		
		System.out.println("Test...");
		// act
		
		// find the search box
		WebElement searchbox = driver.findElement(By.cssSelector("input[name=q]"));
		
		// type selenium in search box
		searchbox.sendKeys("selenium");
			
		// submit
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='btnK']")));
		searchButton.click();
		
		// assert
		// check results
		List<WebElement> searchResults = driver.findElements(By.cssSelector("#rso > div"));
		System.out.println(searchResults.size());
		String firstResult = searchResults.get(0).getText();
		System.out.println(firstResult);
		
		assertTrue(firstResult.contains("Selenium"));
	}
}
