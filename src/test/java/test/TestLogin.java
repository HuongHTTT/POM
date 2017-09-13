package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.login;

public class TestLogin {
	WebDriver driver;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		   driver = new FirefoxDriver(); 
		  driver.get("http://demo.guru99.com/V4/");
	}
	
  @Test
  public void f() {
	  login log = new login(driver);
	  log.login("mrg123", "mrg123");
	  
  }
}
