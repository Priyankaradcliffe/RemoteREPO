package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_DynamicWindow_ID {

	public static void main(String[] args) {
		
		//Locate Chrome browser in current system

				System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();  		//Launch browser
				driver.get("https://www.facebook.com"); 	//Load webpage
				driver.manage().window().maximize();    	//maximize browser window
				
				
				//Capture current window dynamic ID..
				String Dynamic_WindowID=driver.getWindowHandle();
				System.out.println(Dynamic_WindowID);
	}

}
