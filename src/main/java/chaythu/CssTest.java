package chaythu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CssTest {
	By txtUsername = By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[3]/div/input");
	By txtPassword = By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[4]/div/input");
	By btnLogin = By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[5]/button");
	By txtHoTen = By.xpath(".//*[@id='field_hoTen']");
	By txtNoiSinh = By
			.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[2]/div[2]/input");
	By btnTiepTuc = By
			.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[7]/button[1]");
	By txtNgaySinh = By
			.xpath("html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[1]/div[3]/div/input");
	By khung = By.xpath("html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[1]/div[1]/input");

	public void CSS1(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(txtHoTen).sendKeys("12345");
		WebElement css = driver.findElement(txtHoTen);
		System.out.println("Color: " + css.getCssValue("border-style"));
		driver.findElement(txtHoTen).sendKeys("123");
		driver.findElement(txtHoTen).clear();
		driver.findElement(txtNoiSinh).click();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(css).build().perform();
		WebElement color1 = driver.findElement(khung);
		String col = color1.getCssValue("border-bottom-color");
		System.out.println("Color: " + col); 
	}

	public void CSS2(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		String color1 = driver.findElement(btnTiepTuc).getCssValue("border-bottom-color");
		System.out.println("Color:" + color1);
		driver.findElement(txtHoTen).sendKeys("12345");
		driver.findElement(txtNgaySinh).sendKeys("12042005");
		WebElement color2 = driver.findElement(btnTiepTuc);

		Actions actions = new Actions(driver);
		actions.moveToElement(color2).build().perform();
		System.out.println("Color:" + color2.getCssValue("border-bottom-color"));
	}

	public WebDriver setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan/new");
		Thread.sleep(2000);
		driver.findElement(txtUsername).sendKeys("tandd");
		driver.findElement(txtPassword).sendKeys("123456aA@");
		driver.findElement(btnLogin).click();
		return driver;
	}

	public static void main(String[] args) throws InterruptedException {

		CssTest css = new CssTest();
		WebDriver driver = css.setup();
		css.CSS1(driver);
//		css.CSS2(driver);
	}

}
