package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Jamuna/Desktop/html/Control.html");
	WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys(Keys.CONTROL+"a");
	usn.sendKeys(Keys.BACK_SPACE);
}
}
