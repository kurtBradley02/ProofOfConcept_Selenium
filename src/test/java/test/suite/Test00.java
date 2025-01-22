package test.suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test00 {
	
	public WebDriver driver;
	public String scenario;
	
	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
}
