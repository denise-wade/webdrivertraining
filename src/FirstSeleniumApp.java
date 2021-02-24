import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumApp
{
	public static void main(String[] args)
	{
		System.out.println("We've started chrome");
		
		// telling java where to find chromedriver.exe so it can start it up
		System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
	}
}
