package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");

driver.quit();

System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver (1).exe");
WebDriver driver1=new FirefoxDriver();
driver1.get("https://www.netflix.com");
Thread.sleep(10000);
driver1.quit();
	}

}
