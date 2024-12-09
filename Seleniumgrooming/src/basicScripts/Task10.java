package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Flipkart.com");
	WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	search.sendKeys("iphone11");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
	Thread.sleep(2000);
	
	
	
	
}
}
