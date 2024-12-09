package Basicframework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase01 extends GenericScript {
	WebElement usn;
	WebElement psw;
	@Test
	public void usn()
	{
		 usn = driver.findElement(By.id("email"));
		 psw = driver.findElement(By.id("pass"));
		
		
		
	}
	
}
