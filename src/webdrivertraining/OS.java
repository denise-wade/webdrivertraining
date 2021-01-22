package webdrivertraining;

public enum OS
{
	WINDOWS, MAC, LINUX, UNKNOWN;
	
	public static OS detect()
	{
		String os = System.getProperty("os.name").toUpperCase();
		
		if (os.contains("WINDOWS")) { return WINDOWS; }
		if (os.contains("MAC")) { return MAC; }
		if (os.contains("LINUX")) { return LINUX; }
		
		return UNKNOWN;
	}
}
