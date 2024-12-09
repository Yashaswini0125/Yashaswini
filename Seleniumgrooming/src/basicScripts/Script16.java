package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script16 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
WebElement btn1=driver.findElement(By.xpath("//button[@id='btn']"));

btn1.click();
}
}
