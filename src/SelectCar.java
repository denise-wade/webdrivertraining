import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectCar
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		
		
		// select car make dropdown
		WebElement selectElement =  driver.findElement(By.xpath("//select[@name='make']"));
		Select select = new Select(selectElement);
		System.out.println("selected car make: " + select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Honda");
		System.out.println("selected car make: " + select.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
		
		// select fuel type radio 
		List<WebElement> fuelTypes = driver.findElements(By.cssSelector("input[name=fuel_type]"));
		for (WebElement radio : fuelTypes)
		{
			String fuelType = radio.getAttribute("value");
			
			if (fuelType.equalsIgnoreCase("diesel"))
			{
				radio.click();
			}
			
			System.out.println(fuelType + " selected " + radio.isSelected());
			Thread.sleep(1000);
		}
		
		
		
		// select feature checkbox
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
		
		checkboxes.get(1).click();
		Thread.sleep(1000);
		
		for (WebElement checkbox : checkboxes)
		{
			System.out.println(checkbox.getAttribute("value") + " " + checkbox.isSelected());
			
			if (checkbox.isSelected() == false)
			{
				checkbox.click();
			}
			Thread.sleep(1000);
		}
		
		driver.quit();
	}

}
