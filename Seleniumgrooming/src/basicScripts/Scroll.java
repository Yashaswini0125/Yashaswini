package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("(//h3[@class='font-bold text-lg py-2'])[5]"));
JavascriptExecutor js = (JavascriptExecutor)driver;
Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView()",ele);




}
}
