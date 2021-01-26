package locatingtechniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training.one-shore.com/learn_locating_techniques/");
		
		List<WebElement> steps = driver.findElements(By.cssSelector("#steps p"));
		
		System.out.println(steps.size());
		
		driver.quit();		

	}

}
