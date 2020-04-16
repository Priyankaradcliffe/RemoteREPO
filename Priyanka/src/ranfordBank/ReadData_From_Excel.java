package ranfordBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_From_Excel {

	public static void main(String[] args) throws Exception 
	{
		String Path="X:\\Spandana_Workspace\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/Home.aspx");
		driver.manage().window().maximize();
		
		Admin_With_Excel admin=new Admin_With_Excel(driver);
		admin.Excel_Admin_Login();
		
		admin.Excel_New_Branch_Creation();
		
		admin.Excel_New_Role_Creation();
		
		admin.Excel_New_Employee_Creation();
		
	
	}

}
