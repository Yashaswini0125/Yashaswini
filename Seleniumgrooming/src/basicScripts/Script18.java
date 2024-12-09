package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com");
	WebElement usn=driver.findElement(By.id("search"));
String an=usn.getAttribute("Placeholder");
System.out.println(an);
Thread.sleep(1000);
driver.quit();
}
}
