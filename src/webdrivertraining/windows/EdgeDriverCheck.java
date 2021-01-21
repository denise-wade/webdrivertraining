package webdrivertraining.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverCheck
{
	public static void main(String[] args)
	{
		System.out.println("Checking Edge Driver");
		System.setProperty("webdriver.edge.driver", "resources/windows/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://one-shore.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
