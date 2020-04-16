import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
	String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();  	//Launch browser
	driver.get("https://www.amazon.in/");     //Load webpage
	driver.manage().window().maximize(); //maximize browser window
	
	Actions Act = new Actions(driver);
	
	
	
	WebElement Accounts =driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
	WebElement Youracnt= driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
	
	//Act.moveToElement(Accounts).build().perform();// move to Accounts
	
	Act.moveToElement(Accounts).moveToElement(Youracnt).click().build().perform();// move to Your account and click
	
	}


	}
