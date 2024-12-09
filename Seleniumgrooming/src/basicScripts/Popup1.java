package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
	WebElement ele = driver.findElement(By.xpath("//button[@id='buttonAlert1']"));
	ele.click();
	Alert popup = driver.switchTo().alert();
	popup.sendKeys("yes");
	popup.accept();
	String msg = popup.getText();
	System.out.println(msg);
	driver.quit();
	
	
	
	
}
}
