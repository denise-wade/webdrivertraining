import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumBaseTest
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
}
