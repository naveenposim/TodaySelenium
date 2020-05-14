package com.snehajenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestPriority {
	WebDriver driver;
	  @Test(priority=2)
	  public void f() {
		  driver.get("https://www.google.com/");
		  System.out.println(driver.getCurrentUrl());
	  }
	  @Test(priority=1)
	  public void Yahoo() {
		  driver.get("https://login.yahoo.com/");
		  System.out.println(driver.getCurrentUrl());
	  }
	  
	  @Test(priority=3)
	  public void Gmail() {
		  driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		  System.out.println(driver.getCurrentUrl());
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\Naveen Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
				
				   driver.manage().window().maximize();
	}

	  @AfterTest
	  public void afterTest() {
		  //driver.close();
	  }
}

