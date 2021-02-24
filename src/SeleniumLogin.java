import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SeleniumLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		// telling java where to find chromedriver.exe so it can start it up
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		
		// start chrome browser
		WebDriver chrome = new ChromeDriver();
		
		// open URL
		chrome.get("https://the-internet.herokuapp.com/login");
	    
		// find username field and type the username
		chrome.findElement(By.id("username")).sendKeys("tomsmith");
	    
		// find password field and type the password
		chrome.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		// wait a bit so we what happened
		Thread.sleep(3000);
	    
		// find the login button and click it
		chrome.findElement(By.className("fa-sign-in")).click();
		
		// wait a bit so we what happened
		Thread.sleep(3000);
	    
		/// close browser
		chrome.quit();
	}
}
