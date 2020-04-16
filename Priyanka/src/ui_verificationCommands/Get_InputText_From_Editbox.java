package ui_verificationCommands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_InputText_From_Editbox {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver();  		//Launch browser
			driver.get("https://www.spicejet.com"); 	//Load webpage
			driver.manage().window().maximize();    	//maximize browser window
		
			WebElement DepartureDate_Editbox=driver.findElement(By.name("ctl00$mainContent$view_date1"));
			
		//Capture input available at editbox
			String DDate=DepartureDate_Editbox.getAttribute("value");
			System.out.println(DDate);
			
		//Captue default system date
			Date d=new Date();
		//Create simpel date format
			SimpleDateFormat df=new SimpleDateFormat("dd/MM");
		//Convert default system date using simple dateformatter
			String Sdate=df.format(d);
			System.out.println(Sdate);
	
		//Verify Departue date and system date equal comparision
			if(DDate.equals(Sdate))
				System.out.println("Departue date match with system date");
			else
				System.out.println("Departue date mismatch with system date");
			
				
		
	}

}
