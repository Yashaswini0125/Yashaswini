package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Jamuna/Desktop/html/Checkbox.html");
	List<WebElement> cb=driver.findElements(By.xpath("(//input[@type='checkbox'])"));
	int count = cb.size();
	for(int i=1;i<count;i=i+2)
		//{
		//if(i%2!=0)
		{
		WebElement cb1=cb.get(i);
		cb1.click();
		}
	//}
	Thread.sleep(1000);
	for(int i=count-1;i>=1;i=i-2)
	{
		//if(i%2==0)
		//{
		WebElement cb2=cb.get(i);
		cb2.click();
		//}
	}
}
}
