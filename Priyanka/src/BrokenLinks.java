import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException, IOException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("http://newtours.demoaut.com/mercurywelcome.php"); //Load webpage
		driver.manage().window().maximize(); //maximize browser window
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait
		
		
		Thread.sleep(5000);
		
		//capture all the links from a WebPage
		List <WebElement> Links =driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size();i++)		
				
		{
			
			WebElement Element = Links.get(i);	
			 String Url = Element.getAttribute("href");
			 
			 URL link = new URL(Url);
			 
			 //Create connection using URL Object 'link'
			 HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			 
			 Thread.sleep(2000);
			 
			 //Establish connection
			 httpConn.connect();
			 
			 //Return Response code,if it's over 400, then it will be a Broken Link
			 int ResponseCode = httpConn.getResponseCode();
			 
			 
			 if (ResponseCode>=400)
			 {
				 System.out.println(Url + "- is a Broken link" );
				 
			 }
			 else
			 {
				 System.out.println(Url + "- is a Valid link" );
 
			 }
		 }	
			
		
	}
	
}
