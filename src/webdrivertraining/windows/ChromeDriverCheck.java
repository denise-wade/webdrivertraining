package webdrivertraining.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivertraining.OS;

public class ChromeDriverCheck
{
	public static void main(String[] args)
	{
		System.out.println("os: " + OS.detect());

		System.out.println("Checking ChromeDriver");
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://one-shore.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
