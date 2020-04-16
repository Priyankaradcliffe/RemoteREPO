import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncryptedPasswordTC {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webDriver interface
		WebDriver driver=new ChromeDriver();
		
		//Launch browser
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize(); //maximize browser window
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("HELLOcDM0");
		Thread.sleep(4000);
		driver.findElement(By.id("u_0_b")).click();
	}	
		 static String decodeString(String password)
		{
			byte[] decodedString = Base64.decodeBase64(password);
			return(new String(decodedString));

		}
		
	

}
