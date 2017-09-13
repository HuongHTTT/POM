package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	@FindBy (how = How.ID_OR_NAME, using = "uid")
	WebElement username;
	
	@FindBy (how = How.NAME, using ="password")
	WebElement password;
	
	@FindBy (name="btnLogin")
	WebElement login;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		  //This initElements method will create all WebElements
		//PageFactory will search for an element on the page that matches the field name of the WebElement in the class
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String userName){
		username.sendKeys(userName);
	}
	
	public void  setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void click(){
		login.click();
	}
	
	public void Login(String Pass, String userName) {
		this.setPassword(Pass);
		this.setUserName(userName);
		this.click();
	}

}
