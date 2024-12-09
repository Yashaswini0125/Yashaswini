package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//button[@id='buttonAlert5']"));
ele.click();
	Alert popup = driver.switchTo().alert();
	//popup.sendKeys("yes");
	popup.accept();
	String msg = popup.getText();
	System.out.println(msg);
	driver.quit();

}
}
