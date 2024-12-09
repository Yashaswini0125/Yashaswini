package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadPopup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/dummy.html");
	WebElement fup = driver.findElement(By.id("f"));
	fup.sendKeys("C:\\Users\\Jamuna\\Downloads\\Yashaswini K P-resume (1).pdf");
	
	
}
}
