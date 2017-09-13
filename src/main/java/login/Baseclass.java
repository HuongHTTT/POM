package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	static WebDriver driver;
	public static WebDriver getDriver() {
		if(driver == null){
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		     driver = new FirefoxDriver(); 
		}
		return driver;
		
	}
	
	public static void  takeSnapShot(WebDriver webdriver, String fileWithPath) throws IOException {
		// convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = (TakesScreenshot) webdriver;
	    //Call getScreenshotAs method to creat image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//move image file to new destination
		File DesFile = new File(fileWithPath);
		//copy file at destination
		FileUtils.copyFile(SrcFile, DesFile);
	}

}
