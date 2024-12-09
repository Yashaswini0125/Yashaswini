package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
    WebElement signup=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
    driver.switchTo().frame(signup);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abcd_01");
	//driver.findElement(By.name("password")).sendKeys("abc@0123");
	Thread.sleep(1000);
	//driver.findElement(By.name("confirm-password")).sendKeys("abc@0123");
}
}
