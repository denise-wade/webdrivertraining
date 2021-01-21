package webdrivertraining.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverCheck
{
	public static void main(String[] args)
	{
		System.out.println("Checking IE Driver");
		System.setProperty("webdriver.ie.driver", "resources/windows/IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://one-shore.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
