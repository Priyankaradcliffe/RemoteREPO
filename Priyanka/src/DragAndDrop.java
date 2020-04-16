import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();  	//Launch browser
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");     //Load webpage
	driver.manage().window().maximize(); //maximize browser window
	

	Actions Act = new Actions(driver);
	
	WebElement source =driver.findElement(By.xpath("//*[@id=\"box3\"]"));
	WebElement Target = driver.findElement(By.xpath("//*[@id=\"box103\"]"));

	//Act.clickAndHold(source).moveToElement(Target).release().build().perform();
	Act.dragAndDrop(source, Target);
	
	// right click on that element
	}
	
}
