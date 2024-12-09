package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Demo.html");
    WebElement ele=driver.findElement(By.id("t1"));
    ele.sendKeys("abcd");
	WebElement ele1=driver.findElement(By.name("n1"));
	ele1.sendKeys("efgh");
	WebElement ele2=driver.findElement(By.className("c1"));
	ele2.sendKeys("efgh");
	ele.clear();
	WebElement ele3=driver.findElement(By.linkText("Instagram 2024"));
	ele3.click();
	
	
}
}
