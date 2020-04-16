package selenium_webdriverr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_webDriver {

	public static void main(String[] args) {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("prriyanka@gmail.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("hello123");
		driver.findElement(By.id("u_0_b")).click();
		
		
		
	}

}
