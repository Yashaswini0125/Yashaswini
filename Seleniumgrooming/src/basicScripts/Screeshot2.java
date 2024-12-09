package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Flipkart.com");
	Date d = new Date();
	String d1 = d.toString().replace(":", "-");
	System.out.println(d1);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int noOfLinks = links.size();
	for(int i=0;i<noOfLinks;i++)
	{
		WebElement link = links.get(i);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =  link.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots//img" +i+"Flipkartlinks.png"+ "");
		FileHandler.copy(temp,perm);
		
	}
	
	driver.quit();
	
}
}
