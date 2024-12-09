package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script34 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver. navigate().to("https://www.facebook.com/r.php");
	WebElement dd=driver.findElement(By.id("month"));
	Select s=new Select(dd);
	List<WebElement> opts=s.getOptions();
	int size=opts.size();
	System.out.println(size);
	ArrayList<String> arr=new ArrayList<String>();
	for(int i=0;i<size;i++)
	{
		WebElement opt=opts.get(i);
		String txt=opt.getText();
		arr.add(txt);
	}
	Collections.sort(arr);
	for(String ar:arr)
	{
		System.out.println(ar);
	}
	Collections.sort(arr,Collections.reverseOrder());
	for(String ar:arr)
	{
		System.out.println(ar);
	}
	driver.quit();
	
	
	
	
	
	
}
}
