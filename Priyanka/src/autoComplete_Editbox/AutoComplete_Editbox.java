package autoComplete_Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("RoundTrip")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Thread.sleep(4000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.linkText("27")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("W"+Keys.ARROW_RIGHT+"ed, 24 Jun, 2020");
		driver.findElement(By.id("ReturnDate")).sendKeys(Keys.ESCAPE);
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[3]/a")).click();
		//driver.findElement(By.linkText("5")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Adults")).sendKeys("4");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("SearchBtn")).click();
		
		


		

		
		
		

		
		

		
		
		

	}

}
