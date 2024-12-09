package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script8 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.Facebook.com");
	WebElement ele=driver.findElement(By.id("email"));
	ele.sendKeys("abcd1@gmail.com");
	WebElement ele1=driver.findElement(By.id("pass"));
	ele1.sendKeys("abcd@01");
	WebElement ele2=driver.findElement(By.name("login"));
	ele2.click();
}
}
