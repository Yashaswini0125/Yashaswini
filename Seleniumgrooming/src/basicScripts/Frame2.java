package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Mainpage1.html");
	WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("admin");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
	psw.sendKeys("admin@12");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
	mob.sendKeys("9876543219");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("abcd@13");
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	mob.clear();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	usn.clear();
	
}
}
