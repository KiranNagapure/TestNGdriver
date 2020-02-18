package com.start.TestingMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGtry {
  @Test
  public void f() {
	  System.out.println("manali");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("landon");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("shimla");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Wwelcome");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("kashmir");
  }

}
