import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LinksTest {
	WebDriver driver;
	
	@BeforeClass
	public void testsetup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver(); 
	driver.get("https://colormoon.in/chithranjan/inb2b/home");
	driver.manage().window().maximize();
	}
	

  @Test
  public void Home()
  {
	 
	  
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
  }
}

