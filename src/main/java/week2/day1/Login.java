package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement Logout = driver.findElement(By.className("decorativeSubmit"));

		//get attribute and print
		String attribute = Logout.getAttribute("value");
		System.out.println(attribute);
		if (attribute.equals("Logout")) {
			System.out.println("Login successful");

			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dxc");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
			WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select select = new Select(dropdown1);
			select.selectByVisibleText("Conference");
			driver.findElement(By.name("submitButton")).click();
			WebElement status = driver.findElement(By.id("viewLead_statusId_sp"));
			String statusText=status.getText();
			
			if(statusText.equals("Assigned")) {
				System.out.println("Status is Pass");
			}
			String title = driver.getTitle();
			System.out.println(title);

		}
	}

}
