package javaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String exp="Dresses Girls";
		driver.findElement(By.className("desktop-searchBar")).sendKeys("dresses");
		Thread.sleep(2000);
		List<WebElement> we = driver.findElements(By.xpath("//ul[@class='desktop-group']//child::*"));
		System.out.println(we.size());

		for (WebElement w : we) {

			String s = w.getText();
			System.out.println(w);
			if (s.equals(exp)) {
				w.click();
			}
		}

	}

}
