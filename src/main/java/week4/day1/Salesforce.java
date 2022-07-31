package week4.day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password$123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//button[contains(@title,'Learn More')]")).click();
		Set<String>salesforce1 = driver.getWindowHandles();
		ArrayList<String> mylist = new ArrayList<String>(salesforce1);
		driver.switchTo().window(mylist.get(1));
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(mylist.get(0));
		driver.quit();
	}

}
