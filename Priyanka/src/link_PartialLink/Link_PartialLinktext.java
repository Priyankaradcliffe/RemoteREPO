package link_PartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_PartialLinktext {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click AboutUs link
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);
		
		//Click Jobs link
		driver.findElement(By.linkText("Jobs")).click();
		Thread.sleep(2000);
		
		//Click Job Openings link
		driver.findElement(By.linkText("Job Openings")).click();
		Thread.sleep(2000);
		
		//Click Manager – Key Account Management link
		driver.findElement(By.partialLinkText("Manager – Key ")).click();
		Thread.sleep(2000);
		
		//Click Job Openings link
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(2000);
		
	}	
		
		
}
