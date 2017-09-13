package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import login.Baseclass;

public class TestBaseClass {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Baseclass.getDriver();
	  System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
	   driver = new FirefoxDriver(); 
	  driver.get("http://demo.guru99.com/V4/");
	  driver.findElement(By.xpath(""));
	  }
}
