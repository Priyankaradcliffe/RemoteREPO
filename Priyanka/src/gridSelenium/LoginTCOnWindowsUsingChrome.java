package gridSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTCOnWindowsUsingChrome {

	static WebDriver driver;

	
		@Test(priority= 0)
		public void Setup() throws MalformedURLException {
			String NodeURL= "http://192.168.1.9:4444/wd/hub";
			
			//DesiredCapabilities cap = DesiredCapabilities.chrome().
			DesiredCapabilities cap = DesiredCapabilities.chrome();

			cap.setBrowserName("Chrome");
			cap.setVersion("80");
			cap.setPlatform(Platform.WIN10);
			
				
			String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait

			//launch chrome browser with help of webDriver interface
			driver=new  RemoteWebDriver(new URL(NodeURL), cap);
					
		}
		
		
	
		@Test(priority=1)
	
			public void Login() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait

			//Launch browser
			driver.get("http://practice.automationtesting.in/my-account/");
			
			driver.manage().window().maximize(); //maximize browser window
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ammu.rapol@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Emmawatson123$%^&*(()");
			driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

			String captext = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
			
			Thread.sleep(2000);

			if(captext.contains("ammu.rapol"))
			{
				System.out.println("My test passed");
			}
			else
			{
				System.out.println("My test Failed");
			}
			Thread.sleep(2000);
			driver.close();
		}
	}
  
  

