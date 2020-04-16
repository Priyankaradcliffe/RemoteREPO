package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDentification_With_Class_Attribute {

	public static void main(String[] args) {
		
		String path ="D:\\\\Selenium Workspace\\\\Browser_drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
				//Identifying location with class property
		driver.findElement(By.className("phone-no")).clear();
		driver.findElement(By.className("phone-no")).sendKeys("abc@yahoomail.com");
		driver.findElement(By.className("orko-button")).click();
		System.out.println("Element identified");



	}

}
