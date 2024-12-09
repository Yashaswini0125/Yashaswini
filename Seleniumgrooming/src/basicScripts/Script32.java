package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

public class Script32 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jamuna/Desktop/html/Dropdown.html");
	WebElement dd=driver.findElement(By.id("Celebrities"));
	Select s=new Select(dd);
 java.util.List<WebElement> opts=s.getOptions();
 int size=opts.size();
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
 
	
}
}
