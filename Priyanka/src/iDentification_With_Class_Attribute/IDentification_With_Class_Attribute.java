package iDentification_With_Class_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IDentification_With_Class_Attribute {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.className("phone-no")).clear();
		driver.findElement(By.className("phone-no")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		String ipvalue=driver.findElement(By.className("phone-no")).getAttribute("value");
		System.out.println(ipvalue);
		String tagname=driver.findElement(By.className("phone-no")).getTagName();
		System.out.println(tagname);
		
		
		//using object dimension get object height and width
		Dimension obj_dimension=driver.findElement(By.className("phone-no")).getSize();
		System.out.println("Object dimension is "+obj_dimension);
		
		int obj_height = obj_dimension.getHeight();
		

		System.out.println("Object height is "+obj_height);
		
		int obj_width= obj_dimension.getWidth();
		System.out.println("Object width is "+obj_width);
		
		driver.findElement(By.className("orko-button-primary")).click();
		
		
	}

}
