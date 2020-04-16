package javaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutordDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webDriver interface
		WebDriver driver=new ChromeDriver();
		
		//Launch browser
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize(); //maximize browser window
		Thread.sleep(2000);
		 
		WebElement joinfree= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a "));
		
		//JavaScriptUtil.flash(joinfree, driver);
		
		//Draw border
		JavaScriptUtil.drawBorder(joinfree, driver);
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target=  new File("C:\\Users\\Goutham\\Downloads\\sCREENshOT.PNG");
		FileUtils.copyFile(src, target );
		
		
		System.out.println(JavaScriptUtil.getTitleByJS(driver));
		
		
		//JavaScriptUtil.clickElementByJS(joinfree, driver);
		//JavaScriptUtil.generateAlert(driver, "Join Now has been clicked");
		//JavaScriptUtil.refreshPageByJS(driver);
		
		
		//Scroll down the page till you find the element
		//WebElement element1= driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptUtil.scrollToViewByJS(element1, driver);
		
		
		//Scroll down the page till the end
		JavaScriptUtil.scrollPagedownByJS(driver);
		
}
}