package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchBetweenAlerts {
	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("http://demo.automationtesting.in/Alerts.html");     //Load webpage
		driver.manage().window().maximize(); //maximize browser window
		
		
		//Alert with OK link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		
		//Alert with OK Button
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(1000);
		
		//Alert Text
		System.out.println(driver.switchTo().alert().getText());
		//close the alert
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);


		//Alert with OK & Cancel 
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//Alert with OK & Cancel Button
		//driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//Thread.sleep(1000);
		
		//Alert Text
		//System.out.println(driver.switchTo().alert().getText());
		
		
		String Exp_Text_OK = "You pressed Ok";

		String Exp_Text_Cancel= "You Pressed Cancel";
		
		//close the alert
		//driver.switchTo().alert().accept();
		
		String Actual_Text_OK= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
				
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p"))
		/*if(Exp_Text_OK.equals(Actual_Text_OK))
		{
			System.out.println("ok is pressed");
		}
		Thread.sleep(1000);
		*/
		

		//Alert with OK & Cancel 
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//Alert with OK & Cancel Button
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(1000);
		//Alert Text
		System.out.println(driver.switchTo().alert().getText());
		

		driver.switchTo().alert().dismiss();
		String Actual_Text_Cancel= driver.findElement(By.cssSelector("p#demo")).getText();
		if(Exp_Text_Cancel.equals(Actual_Text_Cancel))
		{
			System.out.println("Cancel is pressed");
		}
		else 
		{
			System.out.println("No alert");
		}
		Thread.sleep(1000);
		
		
		//Alert with TextBox
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		//Alert with TextBox Button
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(1000);
		
		//Alert Text
		System.out.println(driver.switchTo().alert().getText());
		String Exp_Text_TextBox = "Hello Priyanka How are you today";
		driver.switchTo().alert().sendKeys("Priyanka");

		//close the alert
		driver.switchTo().alert().accept();
		
		String Actual_Text_TB= driver.findElement(By.cssSelector("p#demo1")).getText();
		if(Exp_Text_TextBox.equals(Actual_Text_TB))
		{
			System.out.println("TB is presented");
		}
		else 
		{
			System.out.println("No alert");
		}
		Thread.sleep(1000);
		
	}

}
