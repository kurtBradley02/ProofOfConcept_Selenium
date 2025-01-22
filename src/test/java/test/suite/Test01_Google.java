package test.suite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import test.data.Test01Data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test01_Google extends Test00{
	
	@Test
	public void test01() {
		driver.get("https://www.google.com/");
		
		WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"APjFqb\"]")));
		
		assertEquals(searchBar.isDisplayed(), true);
		
		searchBar.sendKeys(Test01Data.getSearchData());
		
	}
	
}
