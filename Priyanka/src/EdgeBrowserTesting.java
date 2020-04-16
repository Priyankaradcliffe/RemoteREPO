import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowserTesting {
	public static void main(String[] args) throws InterruptedException{
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);

		
		//launch chrome browser with help of webDriver interface
		WebDriver driver=new EdgeDriver();
		
		//Launch browser
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize(); //maximize browser window
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("A123comsdas");
		driver.findElement(By.id("u_0_b")).click();
		String Exptitle = "Facebook – log in or sign up";
		String Acttitle = driver.getTitle();
		Thread.sleep(2000);
		
		if(Exptitle.equals(Acttitle)) {
			System.out.println("Same title");
		}
		else
			System.out.println("diff title");
		
		Thread.sleep(2000);
		
		driver.close();
		

	}	
}
