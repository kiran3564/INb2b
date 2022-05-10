import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CmoonTest {
	  
	WebDriver driver;
	@BeforeClass 
	public void testSetup()
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://colormoon.in/chithranjan/inb2b/home");
	     driver.manage().window().maximize();
		}
	@Test(priority=1)
	
	public void Home()
	{
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
	}
	
	@Test(priority=2)
	public void About() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[3]/a")).click();
	}
	@Test(priority=3)
	public void Contactus() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[4]/a")).click();
		
	}
	
	/*@Test(priority=4,timeOut = 5000)
	public void search() throws IOException
	{
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Demo");
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]/i")).click();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\screenshots\\search.png"));
	}
	
	
	@Test()
	public void Categories()
	{
		driver.findElement(By.xpath("//*[@id=\"stickyheader\"]/div[4]/div[1]/div/div/div/div[2]/div/nav/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarToggleExternalContent\"]/ul/li[2]/a/img")).click();
	}*/
	@Test(priority=4)
	public void contacthome()
	{
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
	}
	

	@Test(priority=5)
	public void footer()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)", "");
	}
	
	@Test(priority=6)
	public void Homefooter()
	{
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
	}
	
	@Test(priority=7)
	public void categories()
	{
		driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div/div/div[2]/div[2]/ul[1]/li[1]/a")).click();
}

	@Test(priority=8)
	public void More()
	{
		driver.findElement(By.xpath("//a[contains(text(),'More..')]")).click();
		
	}
	

@Test(priority=9)
	public void Newsletter() throws InterruptedException {

	  driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div/div/div[4]/div[2]/div/div[1]/div/input")).sendKeys("sting@gmail.com");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[contains(text(),'Subscribe Now')]")).click();
}
@Test(priority=10)
public void Homefoote1r()
{
	driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
}

/*@Test(priority=10)

public void vendorlogin() throws IOException
{
	driver.findElement(By.xpath("//h5[contains(text(),'Vendor Login')]")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiransai@colourmoon.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("F:\\screenshots\\login.png"));
}*/


@Test(priority=11)
public void productview() throws InterruptedException
{
	
	driver.findElement(By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/a/img")).click();
	
	
			}
@Test(priority=12)
public void productgridviewandthumbnail() throws InterruptedException
{
	driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/i[1]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/i[1]")).click();
	
}

}
  
