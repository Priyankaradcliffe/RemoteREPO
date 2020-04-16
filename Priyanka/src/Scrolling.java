import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webDriver interface
		WebDriver driver=new ChromeDriver();
		
		//Launch browser
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //maximize browser window
		 Thread.sleep(2000);
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scolling using Pixel

		//js.executeScript("window.scrollBy(0,1000)", "");
		 
		//Thread.sleep(2000);
		
		//Scrolling till we find the Element
		//WebElement flag = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a"));
		
		//js.executeScript("arguments[0].scrollIntoView();", flag);
		
		
		//Scrolling to the bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
}
