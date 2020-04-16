package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element, WebDriver driver)
	{
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0;i<=200;i++)
		{
			changeColor("#000000",element, driver);
			changeColor(bgcolor,element, driver);
			
		}
	}
		public static void changeColor(String color, WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
			
			try 
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e )
			{
				
			}
		}
		//draw border	

		public static void drawBorder( WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border = '3px solid red'", element);
					
		}
		
		//Get title of the Page
		public static String getTitleByJS( WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String title = js.executeScript("return document.title;").toString();
			return title;
				
		}
		//Click action in JS
		public static void clickElementByJS( WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
					
		}
		
		//Generate Alert
		public static void generateAlert(WebDriver driver, String message)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('"+message+"')");
					
		}
		
		
		//Refreshing Page
		public static void refreshPageByJS(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("history.go(0)");
					
		}
		
		//Scrolling Page till you find an element
		public static void scrollToViewByJS(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
							
		}
		
		//Scrolling Page till the end
		public static void scrollPagedownByJS(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
		}
}
