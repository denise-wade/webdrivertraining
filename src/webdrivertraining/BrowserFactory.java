package webdrivertraining;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory
{
	Properties config;
	
	static Properties defaultConfig;
	static {{
		defaultConfig = new Properties();
		defaultConfig.setProperty("os", OS.detect().name());
		defaultConfig.setProperty("browser", "chrome");
		
		defaultConfig.setProperty("windows.chromedriver.path", "resources/windows/chromedriver.exe");
		defaultConfig.setProperty("windows.geckodriver.path", "resources/windows/geckodriver.exe");
		defaultConfig.setProperty("windows.edgedriver.path", "resources/windows/msedgedriver.exe");
		defaultConfig.setProperty("windows.iedriver.path", "resources/windows/IEDriverServer.exe");

		defaultConfig.setProperty("mac.chromedriver.path", "resources/mac/chromedriver");
		defaultConfig.setProperty("mac.geckodriver.path", "resources/mac/geckodriver");
	}}
	
	public BrowserFactory()
	{
		this.config = defaultConfig;
		setup();
	}
	
	public BrowserFactory(Properties config)
	{
		this.config = defaultConfig;
		this.config.putAll(config);
		setup();
	}
	
	public void setup()
	{
		switch(OS.detect())
		{
			case WINDOWS:
				System.setProperty("webdriver.chrome.driver", config.getProperty("windows.chromedriver.path"));
				System.setProperty("webdriver.gecko.driver", config.getProperty("windows.geckodriver.path"));
				System.setProperty("webdriver.edge.driver", config.getProperty("windows.edgedriver.path"));
				System.setProperty("webdriver.ie.driver", config.getProperty("windows.iedriver.path"));
				break;
			case MAC:
				System.setProperty("webdriver.chrome.driver", config.getProperty("mac.chromedriver.path"));
				System.setProperty("webdriver.gecko.driver", config.getProperty("mac.geckodriver.path"));
				break;
			default:
				System.setProperty("webdriver.chrome.driver", config.getProperty("webdriver.chrome.driver"));
				System.setProperty("webdriver.gecko.driver", config.getProperty("webdriver.gecko.driver"));
				System.setProperty("webdriver.edge.driver", config.getProperty("webdriver.edge.driver"));
				System.setProperty("webdriver.ie.driver", config.getProperty("webdriver.ie.driver"));
		}
	}
	
	public WebDriver getDriver()
	{
		String browser = config.getProperty("browser");
		return getDriver(browser);
	}
	
	public WebDriver getDriver(String browserName)
	{
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		return getDriver(browser);
	}
	
	public WebDriver getDriver(BROWSER browser)
	{		
		switch(browser)
		{
			case CHROME:
				return new ChromeDriver();
			case FIREFOX:
				return new FirefoxDriver();
			case EDGE:
				return new EdgeDriver();
			case IE:
				return new InternetExplorerDriver();
			case SAFARI:
				return new SafariDriver();
			default:
				throw new RuntimeException("Unknown browser");	
		}
	}
}
