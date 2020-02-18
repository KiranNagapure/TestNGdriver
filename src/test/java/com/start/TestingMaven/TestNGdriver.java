package com.start.TestingMaven;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGdriver {
	WebDriver driver;
	@Parameters("pqr")
  @BeforeTest
  public void setup(String mycomingbrowserName) {
	  
	  System.out.println(mycomingbrowserName);
	  
	  if(mycomingbrowserName.equals("chrome")) {
	 System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
    driver = new ChromeDriver(); 
	  }
	  else if(mycomingbrowserName.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
		    driver = new FirefoxDriver(); 
			  }
	  else if(mycomingbrowserName.equals("ie")) {
			 System.setProperty("webdriver.ie.driver", "resource/IEDriverserver.exe");
		    driver = new InternetExplorerDriver(); 
			  }
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
  }
  @Test
  public void loginmethod() {
	  
	  WebElement username = driver.findElement(By.id("email"));
	  username.sendKeys("kiranrajat@gmail.com");
	  
	  WebElement password = driver.findElement(By.id("pass"));
	  password.sendKeys("kiran1234");
	  
	  WebElement submit = driver.findElement(By.id("loginbutton"));
	  submit.click();

  }
  @AfterTest
  public void teardown() {
	  
	 try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 driver.quit(); 
  }
  
}
