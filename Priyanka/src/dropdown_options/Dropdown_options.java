package dropdown_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_options {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		driver.findElement(By.id("customLocality"))
		.sendKeys("LB Nagar");
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(1);
	
		driver.findElement(By.id("amenity_category_order_types50")).click();
		driver.findElement(By.xpath("//*[@id=\"SearchCustomAddress\"]/ul/li[7]/input")).click();
		
		
		
		
	}

}
