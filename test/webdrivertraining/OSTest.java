package webdrivertraining;

import org.testng.annotations.Test;

public class OSTest
{
	@Test
	public void detectOS()
	{
		System.out.println("Detecting OS: " + OS.detect());
	}
}
