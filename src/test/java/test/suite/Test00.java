package test.suite;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test00 {
	
	public WebDriver driver;
	public String scenario;
	
	public WebDriverWait wait;
		
	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
}
