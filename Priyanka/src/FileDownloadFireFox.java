import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadFireFox {
	public static void main(String[] args) throws InterruptedException, IOException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		//Creating Browser profile
		FirefoxProfile Profile = new FirefoxProfile();
		
		//Set MIME Types: https://www.sitepoint.com/mime-types-complete-list/
		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		Profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(Profile);
		
		
		WebDriver driver=new FirefoxDriver(option);
		//Launch browser
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize(); //maximize browser window

		
		
		
		driver.findElement(By.id("textbox")).sendKeys("Testing pika alrdkaslkdflw");
		driver.findElement(By.id("createTxt")).click();//Generate text file
		
		driver.findElement(By.id("link-to-download")).click();//download that text file
		}
}
