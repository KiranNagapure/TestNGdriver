package com.start.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyclassWithout {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	
		
	}
	@Test
	public void loginmethod()
	{
		WebElement ussername = driver.findElement(By.id("email"));
		ussername.sendKeys("kiranr@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("rajat123");
		WebElement submit = driver.findElement(By.id("loginbutton"));
		submit.click();
		
	}
	@AfterTest
	public void teardown()
	{
		try {
			Thread.sleep(4000);
		} catch ( InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}


}
