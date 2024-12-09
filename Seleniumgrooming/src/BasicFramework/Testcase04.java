package BasicFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase04 extends GenericScript
{
	@Test
	public void link()
	{
		String text = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getText();
		System.out.println(text);
		
		
	}
	
	
	

}
