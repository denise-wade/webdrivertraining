package browserdrivertests;

import org.testng.annotations.Test;

import webdrivertraining.OS;

public class OSTest
{
	@Test
	public void detectOS()
	{
		System.out.println("Detecting OS: " + OS.detect());
	}
}
