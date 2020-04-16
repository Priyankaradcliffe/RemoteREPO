import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();  	//Launch browser
	driver.get("http://demo.automationtesting.in/FileDownload.html"); //Load webpage
	driver.manage().window().maximize(); //maximize browser window
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait
	//driver.findElement(By.id("textbox")).sendKeys("Testing pika alrdkaslkdflw");
	//driver.findElement(By.id("createTxt")).click();//Generate text file
	
	//driver.findElement(By.id("link-to-download")).click();//download that text file
	
	driver.findElement(By.id("pdfbox")).sendKeys("Testing pika pdf");
	driver.findElement(By.id("createPdf")).click();//Generate pdf file
	
	driver.findElement(By.id("pdf-link-to-download")).click();//download that text
	
	Thread.sleep(4000);
	
	if(isFileExisted("C:\\Users\\Goutham\\Downloads\\info.pdf"))
	{
		System.out.println("Pdf exists");
	}
	else
	{
		System.out.println("Pdf doesn't exist");
	}
	}
	
	
	static boolean isFileExisted(String pathh)
	{
		File f = new File(pathh);
	
	if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
	}

			
	
	
	
}
