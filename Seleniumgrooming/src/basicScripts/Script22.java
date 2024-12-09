package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com");
	WebElement usn=driver.findElement(By.id("search"));
	usn.sendKeys("songs");
	Thread.sleep(1000);
	usn.sendKeys(Keys.CONTROL+"a");
	usn.sendKeys(Keys.BACK_SPACE);

}
}
