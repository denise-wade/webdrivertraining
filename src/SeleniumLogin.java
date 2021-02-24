import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class SeleniumLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		// telling java where to find chromedriver.exe so it can start it up
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		
		// start chrome browser
		WebDriver driver = new ChromeDriver();
		
		// open URL
		driver.get("https://the-internet.herokuapp.com/login");
	    
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
	    
		/// close browser
		driver.quit();
	}
}
