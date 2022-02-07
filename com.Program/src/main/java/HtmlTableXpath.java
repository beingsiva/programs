import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTableXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		driver.get("file:///C:/Users/91853/Downloads/Table%20(1).html");
		
		String expected= sc.nextLine();
		String actual = driver.findElement(By.xpath("//span[text()='"+expected+ "']")).getText();
		//System.out.println(actual);
		if(expected.equals(actual)) {
		String siva = driver.findElement(By.xpath("//span[text()='"+expected+ "']/ancestor::tr")).getAttribute("rowindex");
		System.out.println(siva);
		}
	}

}
