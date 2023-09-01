package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestEx1 {
	@BeforeTest
	public void Login_into_Application()
	{
	System.out.println("Login into Application");	
	}
	@AfterTest
	public void Logout_from_Application()
	{
	System.out.println("Logout from Application");	
	}
	@Test
	public void btest1()
	{
	System.out.println("Login is successful");	
	}
	@Test
	public void atest2()
	{
	System.out.println("Logout is successful");	
	}
}

