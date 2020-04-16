package ranfordBank;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable_Update 
	{

		public static void main(String[] args) throws Exception 
		{
			String Path="D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", Path);
			WebDriver driver=new ChromeDriver();
			driver.get("http://192.168.1.97/ebank2/Home.aspx");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//Admin Username
			driver.findElement(By.id("txtuId")).clear();
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
			
			//Admin Password
			driver.findElement(By.id("txtPword")).clear();
			driver.findElement(By.id("txtPword")).sendKeys("Admin");
			
			//Admin Login
			driver.findElement(By.id("login")).click();
			
			//Click on Branches
			WebElement Branches_link=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img"));
			Branches_link.click();
			Thread.sleep(2000);
			
			
			boolean flag=false;
			boolean flag1=false;
			int x=0;
			do {
				WebElement Table;
				Table=driver.findElement(By.id("DG_bankdetails"));
				
				WebElement Last_Row;
				Last_Row=Table.findElements(By.tagName("tr")).get(6);
				
				List<WebElement> Pagelinks;
				Pagelinks=Last_Row.findElements(By.tagName("a"));
				
				int Link_Count;
				Link_Count=Pagelinks.size();
				System.out.println(Link_Count);
				
				for (int i = x; i <= Link_Count-1; i++) 
				{
					if(x == 1)
					{
						Pagelinks.get(i-1).click();
						Thread.sleep(1000);						
					}
					//Find list of rows under each row
					List<WebElement> Rows=Table.findElements(By.tagName("tr"));
					int Rows_size=Rows.size();
					
					System.out.println("List of rows at each page is => " +Rows_size);
					
					//iterate for number of rows
					for (int j = 1; j <=5; j++)
					{
						//Find list of cells under each row
						List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
						int Cell_size=Cells.size();
						
						//System.out.println("List of cells at each page is => " +Cell_size);
						
						//iterate for number of cells
						for (int k = 0; k < Cell_size; k++) 
						{
							String EachCell_Text=Cells.get(k).getText();
							
							if (EachCell_Text.equals("mdqdsnr123")) 
							{
								Cells.get(6).findElement(By.tagName("a")).click();
								Thread.sleep(1000);
								WebTable_Admin_Branch_Update Bupdate= new WebTable_Admin_Branch_Update(driver);
								Bupdate.Branch_Updation("Hello11", "dsnr", "chaita", "puri", "MQ", "12346", "UK", "Manchester", "London");
								
								Keywords Alert=new Keywords(driver);
								//Alert.Alert_handle();
								flag1=true;
								break;
					
							}
							
							
						}
						
						if(flag1==true)
						{
							break;	
						}
								
					}
					
					if(flag1==true)
					{
						break;	
					}
					
					
					
					//Restore Table details to avoid staleElement reference exception
					Table=driver.findElement(By.id("DG_bankdetails"));
					Last_Row=Table.findElements(By.tagName("tr")).get(6);
					Pagelinks=Last_Row.findElements(By.tagName("a"));
					x=1;
			
				}
				if(flag1==true)
				{
					break;
				}
				
		
				String Next;
				Next=Pagelinks.get(Link_Count-1).getText();
				
				if(Next.equals("..."))
				{
					flag=true;
					Pagelinks.get(Link_Count-1).click();
					
				}
				
				if (!Next.equals("..."))
				{
					flag=false;	
				}
				
			} while (flag);
					

		}


}
	

