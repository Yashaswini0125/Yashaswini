package Basicframework01;

import org.testng.annotations.Test;

public class Testcase02 extends Testcase01 {
	@Test
	public void psw()
	{
		usn.sendKeys("1Bi20");
		psw.sendKeys("yashu01");
	   
	}

	public void refresh() throws InterruptedException
	{
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 usn.sendKeys("admin");
	 psw.sendKeys("admin@123");
	}
		
		
}
