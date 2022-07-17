package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dxc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Skumar");
		driver.findElement(By.name("departmentName")).sendKeys("Service Center");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a service line department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santoshasadshiv@gmail.com");
        
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			driver.findElement(By.id("createLeadForm_companyName")).clear();
		      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infosys");
			 driver.findElement(By.id("createLeadForm_firstName")).clear();
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Samarth");
			 driver.findElement(By.name("submitButton")).click();
			 String removedDup = driver.getTitle();
				System.out.println(removedDup);
				if(!removedDup.contains("Duplicate")) {
					System.out.println("Not a duplicate entry");
				}
		}
      
		
	}

}
