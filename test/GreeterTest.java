import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GreeterTest
{
	@Test
	public void testHello()
	{
		// Arrange 
		Greeter sam = new Greeter();
		
		// Act
		String greeting = sam.greet();
		
		// Assert
		assertEquals(greeting, "Hello");
	}
	
}
