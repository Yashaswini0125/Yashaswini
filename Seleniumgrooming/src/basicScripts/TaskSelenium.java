package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSelenium {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	WebElement net = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
	WebElement ruby = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
	WebElement python = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
	WebElement js = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
	ArrayList<WebElement> arr = new ArrayList<WebElement>();
	arr.add(net);
	arr.add(ruby);
	arr.add(python);
	arr.add(js);
	int count = arr.size();
	for(int i=0;i<count;i++)
	{
		WebElement link = arr.get(i);
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.contextClick(link).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
		Set<String> wins = driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(1000);
			driver.close();
			
		}
		}	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
