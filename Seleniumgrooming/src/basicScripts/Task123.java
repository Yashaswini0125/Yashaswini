package basicScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Task123 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
	Thread.sleep(1000);
	WebElement from = driver.findElement(By.id("txtOriginGeneral"));
	from.click();
    WebElement from1 =	driver.findElement(By.xpath("(//div[@class='select2-result-label'])[7]"));
	from1.click();
	
	WebElement to = driver.findElement(By.id("txtDestinationGeneral"));
	to.click();
	WebElement to1 = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
	to1.click();
	WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	date.click();
    WebElement date1 =	driver.findElement(By.xpath("//a[.='25']"));
	date1.click();
	WebElement rtd  = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	rtd.click();
	WebElement rtd1 =	driver.findElement(By.xpath("//a[.='30']"));
	rtd1.click();
	WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
	button.click();
	WebElement search = driver.findElement(By.id("BOTD4CBED18569A397C9309C060ABB60A05"));
	search.click();
	Thread.sleep(1000);
	WebElement seat1 = driver.findElement(By.xpath("(//small[.='21'])[1]"));
	seat1.click();
	Thread.sleep(1000);
	WebElement seat2 = driver.findElement(By.xpath("//small[.='16'])[2]"));
	seat2.click();
	Thread.sleep(1000);
	WebElement seat3 = driver.findElement(By.xpath("//small[.='7'])[2]"));
	seat3.click();
	Thread.sleep(1000);
	WebElement seat4 = driver.findElement(By.xpath("//small[.='20'])[2]"));
	seat4.click();
	Thread.sleep(1000);
	WebElement seat5 = driver.findElement(By.xpath("//small[.='21'])[2]"));
	seat5.click();
	Thread.sleep(1000);
	WebElement seat6 = driver.findElement(By.xpath("//small[.='4'])[2]"));
	seat6.click();
	
	
	
	
	
	
	
}
}
