import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, FindFailed{
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.google.com/imghp?hl=en"); //Load webpage
		driver.manage().window().maximize(); //maximize browser window
		
		driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[3]/div[2]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"dRSWfb\"]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"awyMjb\"]")).click();
		
		Screen s = new Screen();
		Pattern  FileinputTextBox = new Pattern("Downloads\\File path name.PNG");
		Pattern Open = new Pattern("Downloads\\Open Button.PNG");
		Thread.sleep(4000);
		
		s.wait(FileinputTextBox, 20);
		s.type(FileinputTextBox, "Downloads\\yoda.png");
		s.click(Open);
		
	}
}
