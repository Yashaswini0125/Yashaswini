package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement ele=driver.findElement(By.cssSelector("input[id='search']"));
	ele.sendKeys("yash songs");
	WebElement ele1=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
	ele1.click();
	WebElement ele2=driver.findElement(By.cssSelector("video[tabindex='-1']"));
	ele2.click();
	
}
}
