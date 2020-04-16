import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRIghtClick {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");     //Load webpage
		driver.manage().window().maximize(); //maximize browser window
		
		Actions Act = new Actions(driver);
		WebElement button =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Act.contextClick(button).build().perform();// right click on that element
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		
		//Alert Text
		System.out.println(driver.switchTo().alert().getText());
		//close the alert
		driver.switchTo().alert().accept();
		

	
	}
}
