package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import login.LoginPageFactory;

public class TestFactory {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		   driver = new FirefoxDriver(); 
		  driver.get("http://demo.guru99.com/V4/");
	}
	
  @Test
  public void f() {
	  LoginPageFactory login = new LoginPageFactory(driver);
	  login.Login("123", "123");
  }
}
