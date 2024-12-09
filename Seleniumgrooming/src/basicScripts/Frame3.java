package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Mainpage2.html");
	WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("abcd");
	Thread.sleep(1000);
	driver.switchTo().frame("f1");
	WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
	mob.sendKeys("98765");
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	driver.switchTo().frame("f2");
	WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("ab@12");
}
}
