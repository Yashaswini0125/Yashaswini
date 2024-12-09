package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script06 {
	@Test(invocationCount=0)
	public void TestCase()
	{
	Reporter.log("Hello",true);
		
	}
	@Test(invocationCount=2)
	public void TestCase1()	
	{
		Reporter.log("Good morning",true);
	}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	

