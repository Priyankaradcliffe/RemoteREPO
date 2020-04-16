package fb_SignUP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_SignUp {

		public static void main(String[] args) {
			String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("u_0_m")).clear();
			driver.findElement(By.id("u_0_m")).sendKeys("Pika");
			driver.findElement(By.id("u_0_o")).clear();
			driver.findElement(By.id("u_0_o")).sendKeys("Raps");
			driver.findElement(By.id("u_0_r")).clear();
			driver.findElement(By.id("u_0_r")).sendKeys("hellos@gmail.com");
			driver.findElement(By.id("u_0_u")).clear();
			driver.findElement(By.id("u_0_u")).sendKeys("hellos@gmail.com");
			driver.findElement(By.id("u_0_y")).clear();
			driver.findElement(By.id("u_0_y")).sendKeys("hellos12com");
			driver.findElement(By.id("day")).sendKeys("13");
			driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
			driver.findElement(By.id("year")).sendKeys("1990");
			driver.findElement(By.name("sex")).click();
			driver.findElement(By.id("u_0_15")).click();

			
			
	}

}
