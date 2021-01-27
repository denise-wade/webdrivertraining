package examples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikipediaTest extends WebDriverTest
{

	@Test
	public void searchForWebDriver()
	{
		// act
		
		// open wikipedia
		driver.get("https://wikipedia.org");
		
		// enter webdriver in searchbox
		driver.findElement(By.id("searchInput")).sendKeys("Webdriver");
		
		// click search
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		
		// get title
		String title = driver.getTitle();
		System.out.println("title: " + title);
		
		// assert
		assertEquals(title, "Selenium (software) - Wikipedia");
		
	}
}
