package webdrivertraining.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivertraining.OS;

public class ChromeDriverCheck
{
	public static void main(String[] args)
	{		
		System.out.println("os: " + OS.simpleName());
		
		System.out.println("Checking ChromeDriver");
		System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://one-shore.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
