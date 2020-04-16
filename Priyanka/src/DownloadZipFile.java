import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipFile {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		//Creating Browser profile
		FirefoxProfile Profile = new FirefoxProfile();
		
		//Set MIME Types: https://www.sitepoint.com/mime-types-complete-list/
		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		Profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(Profile);
		
		
		WebDriver driver=new FirefoxDriver(option);
		//Launch browser
		driver.get("https://testingmasters.com/student-corner/downloads/");
		driver.manage().window().maximize(); //maximize browser window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait
		
		
		driver.findElement(By.xpath("//*[@id=\"tablepress-7\"]/tbody/tr[1]/td[2]/a")).click();//click Download button
		
		
	}
}
