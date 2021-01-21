package webdrivertraining.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCheck
{
	public static void main(String[] args)
	{
		System.out.println("Checking Firefox driver");		
		System.setProperty("webdriver.chrome.driver", "resources/windows/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://one-shore.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
