package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com");
	WebElement usn=driver.findElement(By.id("search"));
	String val=usn.getCssValue("font-weight");
	System.out.println(val);
	Thread.sleep(1000);
	driver.quit();
}
}
