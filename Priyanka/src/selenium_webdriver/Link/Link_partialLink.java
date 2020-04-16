package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_partialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("About Us")).click();

		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.linkText("Job Openings")).click();
		driver.findElement(By.partialLinkText("QA")).click();;
		driver.findElement(By.linkText("Flights")).click();;
		
		
	}

}
