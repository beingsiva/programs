package dataProvider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProvider1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd) {
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys(pwd);
		
		driver.findElement(By.id("submitButton")).click();
		String exp = "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
		
		if(driver.getTitle().equals(exp)) {
			System.out.println("Successfully logged in");
			WebElement signimg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			WebElement signbutton = driver.findElement(By.xpath("//a[text()=\"Sign Out\"]"));
			Actions act= new Actions(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(signimg).moveToElement(signbutton).click().build().perform();
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider(name="LoginData")
	public String[][] getData() {
		String loginData[][]= {
				{"admin","admin"},
				{"admin","admi"},
				{"admin","admn"},
				{"admin","amin"}
		};
		return loginData;
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
