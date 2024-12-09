package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script31dd {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Dropdown.html");
	WebElement dd=driver.findElement(By.id("Celebrities"));
	Select s=new Select(dd);
	List<WebElement> opts=s.getOptions();
	int optscount= opts.size();
	for(int i=0;i<optscount;i++)
	{
	 WebElement opt=opts.get(i);
	 String txt=opt.getText();
	 System.out.println(txt);
	
	 
	 
	 
	}
	Thread.sleep(1000);
	driver.quit();
}
}
