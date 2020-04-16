import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

		public static void main(String[] args) throws InterruptedException {
			String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver=new ChromeDriver();  	//Launch browser
			driver.get("https://jqueryui.com/slider/");     //Load webpage
			driver.manage().window().maximize(); //maximize browser window
			

			driver.switchTo().frame(0);
			
			WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
			Actions Act = new Actions(driver);
			Act.moveToElement(slider).dragAndDropBy(slider, 600, 0).build().perform();
			
				
	}

}
