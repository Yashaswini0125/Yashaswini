package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 {
@Test
public void TestCase()
{
Reporter.log("Hello",true);
	
}
@Test
public void TestCase1()	
{
	Reporter.log("Good morning",true);
}
	
	
}
