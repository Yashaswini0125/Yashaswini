package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script35 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	WebElement dd=driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
	Select s=new Select(dd);
	if(s.isMultiple())
	{
		s.selectByVisibleText("Running Shoes");
		
	}
}
}
