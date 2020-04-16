package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Element_Text {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Scenario:-->  Gmail login with invalid domain-name
		 * 
		 * 		Given valid url http://gmail.com
		 * 		When enter username with invalid domain address
		 * 		And click on Next button
		 * 		Then receive Expected Error msg 'Couldn't find your Google Account'. 
		 * 		
		 */
	
		//Locate chrome browser in currnet system

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.gmail.com"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
				
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@outlook.com"+Keys.RETURN);
		Thread.sleep(3000);
		
		//Identify location of text
		WebElement Error_locator=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		
		String Runtime_Err_text=Error_locator.getText();
		System.out.println("Error text is==>"+Runtime_Err_text);
		
		String Exp_text="Couldn't find your Google Account";
		if(Runtime_Err_text.equals(Exp_text))
			System.out.println("Expected error msg displayed on invalid domain address");
		else
			System.out.println("wrong error msg displayed on invalid domain address");
	}

}
