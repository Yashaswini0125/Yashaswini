package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.com");
}
}
