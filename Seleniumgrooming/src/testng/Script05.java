package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Script05 {
	@Test
	public void signup()
	{
		System.out.println("signup is successfull");
	}
	@Test(dependsOnMethods="signup")
	public void login()
	{
		System.out.println("login is successfull");
	}
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		Assert.fail();
		System.out.println("homepage is successfull");
	}
	@Test(dependsOnMethods="homepage")
	public void logout()
	{
		System.out.println("logout is successfull");
	}



}
