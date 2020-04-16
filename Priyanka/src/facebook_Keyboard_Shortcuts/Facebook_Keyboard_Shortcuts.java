package facebook_Keyboard_Shortcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Keyboard_Shortcuts {

	public static void main(String[] args) {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("priyanka"+ Keys.TAB
													+"rapoluu"+Keys.TAB	
													+"hellos@gmail.com"+Keys.TAB
													+"hellos@gmail.com"+Keys.TAB
													+"Hellos123");
		driver.findElement(By.id("day")).sendKeys("13");
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.name("u_0_6")).click();
		driver.findElement(By.id("u_0_15")).click();
		
		
	
	}

}
