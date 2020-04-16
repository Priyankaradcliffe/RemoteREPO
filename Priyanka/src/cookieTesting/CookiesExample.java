package cookieTesting;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {
public static void main(String[] args) throws InterruptedException {
		
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webDriver interface
		WebDriver driver=new ChromeDriver();
		
		//Load webpage to browser window
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Set<Cookie > cookies =	driver.manage().getCookies();//capture all the cookies from the browser
		 
		System.out.println("Number of cookies " + cookies.size());
		
		for(Cookie cookie:cookies)// read and print all the cookies one by one
		{
			System.out.println(cookie.getName()+ " : " +cookie.getValue());
			
		}
		Thread.sleep(3000);
		
		System.out.println(driver.manage().getCookieNamed("session-id"));//get specific cookie value and stuff by its name
		 Thread.sleep(2000);
		
		//add new Cookie to the browser
		Cookie cobj= new Cookie("mycookie123", "12345678");
		driver.manage().addCookie(cobj);
		
		cookies =	driver.manage().getCookies();//capture all the cookies from the browser
		 
		System.out.println("Number of cookies " + cookies.size());
		
		for(Cookie cookie:cookies)// read and print all the cookies one by one
		{
			System.out.println(cookie.getName()+ " : " +cookie.getValue());
		}
		 Thread.sleep(2000);
		 
		//delete a specific cookie
		driver.manage().deleteCookie(cobj);
		cookies =	driver.manage().getCookies();//capture all the cookies from the browser
		 
		System.out.println("Number of cookies " + cookies.size());
		
		for(Cookie cookie:cookies)// read and print all the cookies one by one
		{
			System.out.println(cookie.getName()+ " : " +cookie.getValue());
		}
		
		Thread.sleep(2000);
		
		//Delete all cookies
		driver.manage().deleteAllCookies();
		cookies =	driver.manage().getCookies();//capture all the cookies from the browser
		 
		System.out.println("Number of cookies " + cookies.size());
		
		for(Cookie cookie:cookies)// read and print all the cookies one by one
		{
			System.out.println(cookie.getName()+ " : " +cookie.getValue());
		}
		driver.close();
		
}
}