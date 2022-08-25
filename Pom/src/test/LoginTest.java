package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mainjava.LoginPage;

public class LoginTest extends BaseTest { 
	
	@Test
	public void verifyLogin() {
		loginPage.loginMethod();
	}
	

}
