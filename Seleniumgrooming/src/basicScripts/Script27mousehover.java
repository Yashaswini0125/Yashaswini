package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script27mousehover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	WebElement Fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
Actions a = new Actions(driver);
Thread.sleep(1000);
a.moveToElement(Fashion).perform();






}
}
