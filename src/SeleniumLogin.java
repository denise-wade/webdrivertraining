import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class SeleniumLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		// telling java where to find chromedriver.exe so it can start it up
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "test\\resources\\IEDriverServer.exe");
		System.setProperty("webdriver.edge.driver", "test\\resources\\msedgedriver.exe");
		
		// start chrome browser
		WebDriver driver = new ChromeDriver();
		
		// or start firefox browser
//		WebDriver driver = new FirefoxDriver();
		
		// or start ie 
//		WebDriver driver = new InternetExplorerDriver();
		
		// pr start edge
//		WebDriver driver = new EdgeDriver();
		
		// resize to test responsive layout on iphone
	    driver.manage().window().setSize(new Dimension(418,896));

	    // set implicit wait to 60 seconds
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		// open URL
		driver.get("https://the-internet.herokuapp.com/login");
	    String title = driver.getTitle();
	    System.out.println("title: " + title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println("url: " + url);
	    
		
		// find username field and type the username
		driver.findElement(By.id("username")).sendKeys("tomsmith");
	    
		// find password field and type the password
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		// wait a bit so we what happened
		Thread.sleep(3000);
	    
		// find the login button and click it
		driver.findElement(By.className("fa-sign-in")).click();
		
		// wait a bit so we what happened
		Thread.sleep(3000);
	    
		// go back to login page
		driver.navigate().back();
		
		// wait a bit so we what happened
		Thread.sleep(3000);
			    
				
		/// close browser
		driver.quit();
	}
}
