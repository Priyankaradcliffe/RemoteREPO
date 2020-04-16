package robot_API;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileFireFox {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		
		WebDriver driver=new FirefoxDriver();
		
		//Launch browser
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize(); //maximize browser window
		
		driver.findElement(By.id("textbox")).sendKeys("Testing pika alrdkaslkdflw");
		driver.findElement(By.id("createTxt")).click();//Generate text file
		
		driver.findElement(By.id("link-to-download")).click();//download that text file
		
		Robot robot = new Robot();
		Thread.sleep(3000);

		/* Down arrow
		 * 3Tabs
		 * enter		
		 */
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		
		
	
	
	}
}
