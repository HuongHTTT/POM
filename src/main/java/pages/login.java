package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By username = By.name("uid");
	By password = By.name("password");
	By login = By.name("btnLogin");
	
	public login(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUserName(String userName){
		driver.findElement(username).sendKeys(userName);
	}
	
	public void setPassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void  login(String userName, String passWord) {
		
		this.setPassword(passWord);
		this.setUserName(userName);
		this.clickLogin();
	}

}
