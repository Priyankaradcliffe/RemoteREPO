import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://jqueryui.com/resizable/");     //Load webpage
		driver.manage().window().maximize(); //maximize browser window
		
		driver.switchTo().frame(0);

		WebElement Resizer =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions Act = new Actions(driver);
		//Act.clickAndHold(source).moveToElement(Target).dragAndDropBy(Resizer, 250, 200).build().perform();
		Act.moveToElement(Resizer).dragAndDropBy(Resizer, 70, 80).build().perform();
		
	}
	
}
