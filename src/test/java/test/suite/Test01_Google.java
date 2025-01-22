package test.suite;

import org.testng.annotations.*;

public class Test01_Google extends Test00{
	
	@Test
	public void test01() {
		driver.get("https://www.google.com/");
	}
	
}
