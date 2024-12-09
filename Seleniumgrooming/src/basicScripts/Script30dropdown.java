package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script30dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Dropdown.html");
	WebElement dd=driver.findElement(By.id("Celebrities"));
	Select s=new Select(dd);
	if(s.isMultiple())
	{
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("k");
		Thread.sleep(1000);
		s.selectByVisibleText("Samantha");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		Thread.sleep(1000);
		s.deselectByValue("k");
		Thread.sleep(1000);
		s.deselectByVisibleText("Samantha");
	
	}
	else
		System.out.println("The dd is Single select");
}
}
