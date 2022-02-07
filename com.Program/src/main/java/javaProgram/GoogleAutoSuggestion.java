package javaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> we = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//child::li[@class='sbct']"));
		System.out.println(we.size());
		for(WebElement w:we) {
			String s=w.getText();
			if(s.endsWith("tpoint")) {
				w.click();
				break;
			}
			
		}
	}

}
