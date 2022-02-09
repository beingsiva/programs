package seleniumElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> name = driver.findElements(By.xpath("//div[@data-title='Test Batting Rankings']/table/tbody/tr/td[2]/a"));
		for(WebElement cname:name) {
			System.out.println(cname.getText());
			if(cname.getText().equals("Rohit Sharma")) {
				cname.click();
			}
			
		}
		
	///cssxpath=	//div[data-title='All-Time Batting Rankings'] tbody tr[class='table-body'] td[class='table-body__cell name'] a
		
		
		
		//WebElement rank = driver.findElement(By.xpath("//div[contains(text(),'Rankings ')]"));
		//WebElement play = driver.findElement(By.xpath("//a[text()='Players Rankings']"));
		//Actions act= new Actions(driver);
		//act.moveToElement(rank).moveToElement(play).click().build().perform();
		//String Bx="//div[@data-title='Test Batting Rankings']/table/tbody/tr/td[2]/a";
		//String Ax="]/td[2]";
		////div[@data-cricket-role='batting']/table[@class='table rankings-card-table']/tbody/tr[1]/td[2]
		//for(int i=1;i<=9;i++) {
			//String name = driver.findElement(By.xpath(Bx+i+Ax)).getText();
			//System.out.println(name);
		}
	}

//tbody tr[class='table-body'] td[class='table-body__cell name'] a[href='/rankings/mens/player-rankings/887']

//div [class='rankings-block__container '] table[class='table'] thead tr[class='table-head'] th[class='table-head__cell'] 

//tbody tr[class='table-body'] td[class='table-body__cell name'] a