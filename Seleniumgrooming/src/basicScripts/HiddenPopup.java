package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HiddenPopup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
	driver.findElement(By.xpath("//span[.='25']")).click();
	
	
	
}
}
