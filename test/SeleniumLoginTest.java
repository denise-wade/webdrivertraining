import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLoginTest
{
	WebDriver driver;
	
	@BeforeClass
	public void configureDrivers()
	{
		System.out.println("set properties to find drivers");
		
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "test\\resources\\IEDriverServer.exe");
		System.setProperty("webdriver.edge.driver", "test\\resources\\msedgedriver.exe");	
	}
	
	@BeforeMethod
	public void setup()
	{
		// open browser
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void cleanup()
	{
		driver.quit();
	}
	
	public String login(String username, String password)
	{
		// go to app URL
		driver.get("https://the-internet.herokuapp.com/login");
				
		// find username field and type the username
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys(username);
	    
		// find password field and type the password
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);

 		// find the login button and click it
		WebElement loginButton = driver.findElement(By.className("fa-sign-in"));
		loginButton.click();

		// get flash message
		WebElement flash = driver.findElement(By.id("flash"));
		String message = flash.getText();
		
		return message;
	}
	
	@Test
	public void testLoginSuccess()
	{
		System.out.println("This should login successfully");
		
		/* Arrange */
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		/* Act */
		String message = login(username, password);
		
		/* Assert */
		System.out.println("message: " + message);
		assertTrue(message.contains("You logged into a secure area!"));
	}
	
	@Test
	public void testLoginFailure()
	{
		System.out.println("This should fail to login");
	
		/* Arrange */
		String username = "tomsmith";
		String password = "SuperDuperWrongPassword!!!";
		
		/* Act */
		String message = login(username, password);
		
		/* Assert */
		System.out.println("message: " + message);
		assertTrue(message.contains("Your password is invalid!"));
	}
}
