package webdrivertraining;

public class OS
{
	public static String simpleName()
	{
		String os = System.getProperty("os.name");
		
		if (os.toLowerCase().contains("mac")) { return "mac"; }
		if (os.toLowerCase().contains("windows")) { return "windows"; }
		if (os.toLowerCase().contains("linux")) { return "linux"; }
		
		return os;
	}
}
