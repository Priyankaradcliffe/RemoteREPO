package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFSC {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Selecting dropdown using visible option name.
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(3000);
		
		//Selecting drodpown using value attribute of option.
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("ananthapur");
		
		driver.findElement(By.cssSelector("label[for='customLocality']+input")).clear();
		driver.findElement(By.cssSelector("label[for='customLocality']+input")).sendKeys("Raju road");

		
		}

}
