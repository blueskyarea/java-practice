package com.blueskyarea;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blueskyarea.factory.WebDriverFactory;

import junit.framework.TestCase;

public class WebPageTest extends TestCase {

	private static String url = "https://ranking.rakuten.co.jp";
	private static List<WebDriverFactory> driverFactories = new ArrayList<>();
	
	@BeforeClass
	public static void beforeClass() {
		driverFactories.add(new WebDriverFactory() {

			@Override
			public WebDriver createWebDriver() {
				return new FirefoxDriver();
			}
			
		});
	}
	
	@Test
	public void testShowTopPage() {
		System.out.println(driverFactories.size());
		//for (WebDriverFactory factory : driverFactories) {
			//WebDriver driver = factory.createWebDriver();
			//Wait<WebDriver> wait = new WebDriverWait(driver, 30);
			
			//WebDriver driver = new FirefoxDriver();
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://ranking.rakuten.co.jp");
			assertTrue(driver.findElement(By.id("rnkContainer")).isEnabled());
		//}
	}
}
