import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;
	
	// constructor function
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
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
}
