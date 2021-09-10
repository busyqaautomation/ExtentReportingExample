package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenersTest.class)
public class MyFirstTest {
	
	
	@Test
	public void FirstTestMethod() {
		
		assertTrue(true);
		
	}
	
	@Test
	public void SecondTestMethod() {
		
		assertTrue(false);
	}

}
