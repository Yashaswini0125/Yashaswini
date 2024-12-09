package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	Thread.sleep(2000);
	driver.findElement(By.id("browserButton2")).click();
	String p_Browser=driver.getWindowHandle();
	Set<String> wins = driver.getWindowHandles();
	ArrayList<String> arr = new ArrayList<String>(wins);
	int count = arr.size();
	for(int i=0;i<count;i++)
	{
		String win  = arr.get(i);
		driver.switchTo().window(win);
		String title = driver.getTitle();
		System.out.println(title);
        if(win.equals(p_Browser))
		driver.close();
		
		
		
		
	}
	
}
}
