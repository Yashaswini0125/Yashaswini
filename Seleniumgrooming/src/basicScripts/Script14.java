package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Jamuna/Desktop/html/display.html");
	WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	if(usn.isDisplayed())
	{
		if(usn.isEnabled())
	usn.sendKeys("admin");
		else
			System.out.println("usn disabled");
	}
	else
		System.out.println("not displayed");
	
}
}
