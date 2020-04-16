import java.util.HashMap;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HashMapLogin {

	static HashMap <String, String> logindata()
	{
		HashMap <String, String> hm = new HashMap <String, String>();
		hm.put("x", "mercury1@mercury");//Usename: mercury1,Password: mercury
		hm.put("y", "mercury2@mercury");
		hm.put("z", "mercury3@mercury");
		
		return hm;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String Credentials = logindata().get("y");
		String arr[] = Credentials.split("@");// username: arr[0], password: arr[1]
		
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);//a
		driver.findElement(By.id("pass")).sendKeys(arr[1]);
		Thread.sleep(4000);
		driver.findElement(By.id("u_0_b")).click();
	}

}
