package ui;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1)
public void loginTest() {
	System.out.println("Login Successful");
}
	@Test(priority=2)
	public void logoutTest() {
		System.out.println("Logout Successful");
}
}
