package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainjava.PimPage;

public class PimTest extends BaseTest {
	
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test
	public void verifyPimPage() {
		Assert.assertEquals(pim.titleofPage(),"PIM");
	}
	

}
