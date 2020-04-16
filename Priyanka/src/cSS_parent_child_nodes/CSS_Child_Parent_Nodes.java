package cSS_parent_child_nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Child_Parent_Nodes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[class='login-form']>div:nth-child(2)>input")).clear();
		driver.findElement(By.cssSelector("div[class='login-form']>div:nth-child(2)>input")).sendKeys("gello@reddifmail.com");
		
		driver.findElement(By.cssSelector("div[class='login-form']>div:nth-child(4)>input[id='password']")).clear();
		driver.findElement(By.cssSelector("div[class='login-form']>div:nth-child(4)>input[id='password']")).sendKeys("hello123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[class='login-form']>div:nth-child(6) input[type='submit']")).click();

		

	}

}
