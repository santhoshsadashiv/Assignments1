package week4.day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumStart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class ='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']/following::img[1]")).click();
		Set<String> window1 = driver.getWindowHandles();
		ArrayList<String> mylist = new ArrayList<String>(window1);
		driver.switchTo().window(mylist.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//table)[4]//tr[1]/td[1]")).click();
		driver.switchTo().window(mylist.get(0));
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']/following::img[1]")).click();
		Set<String> window2 = driver.getWindowHandles();
		ArrayList<String> mylist1 = new ArrayList<String>(window2);
		driver.switchTo().window(mylist1.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//table)[5]//tr[1]/td[1]//a")).click();
		driver.switchTo().window(mylist.get(0));
        driver.findElement( By.className("buttonDangerous")).click();
         Alert alert = driver.switchTo().alert();
         alert.accept();
         System.out.println(driver.getTitle()); 

	}



}
