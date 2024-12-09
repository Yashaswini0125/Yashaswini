package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	Thread.sleep(2000);
	driver.findElement(By.id("browserButton2")).click();
	String win = driver.getWindowHandle();
	System.out.println(win);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
}
