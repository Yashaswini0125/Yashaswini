package BasicFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
	WebDriver driver;
	@BeforeMethod
public void BrowserSetup()
{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		
		
	}
	
	
	
	
}
