package browserdrivertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserDriverTests
{
	@Test
	public void launchFirefox()
	{
		System.out.println("Checking FirefoxDriver");

		System.setProperty("webdriver.gecko.driver", "resources/windows/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://one-shore.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test
	public void launchChrome()
	{
		System.out.println("Checking ChromeDriver");
		System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://one-shore.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test
	public void launchEdge()
	{
		System.out.println("Checking Edge Driver");
		System.setProperty("webdriver.edge.driver", "resources/windows/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://one-shore.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test
	public void launchIE()
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
