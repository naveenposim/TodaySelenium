package com.snehajenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewtestMethod {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "F:\\Naveen Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			  driver.manage().window().maximize();
	 }
	@BeforeMethod(alwaysRun=true)
	  public void beforeMethod() {
		  driver.get("https://www.google.com/");
		  System.out.println("Title of page is :" +driver.getTitle());
	  }
  @Test(priority=1,groups="top")
  public void clickonGmail() {
	  driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	  }
  @Test(priority=2,groups="top")
  public void clickonImages() {
	  driver.findElement(By.linkText("Images")).click();
	  }
  @Test(priority= 3,groups="bottom")
  public void clickonAdvertisement() {
	  driver.findElement(By.linkText("Advertising")).click();
	  }
  @Test(priority= 4,groups="bottom")
  public void clickonBusiness() {
	  driver.findElement(By.linkText("Business")).click();
	  }
  @Test(priority= 5,groups="About")
  public void clickonAbout() {
	 driver.findElement(By.linkText("About")).click();
	  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	 
	  System.out.println("Title of page is :" +driver.getTitle());
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.navigate().back();
	  System.out.println("Title of page is :" +driver.getTitle());
  }

}
