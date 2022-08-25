package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest {
	
		public static WebDriver driver;
		protected LoginPage loginPage;
		protected PimPage pim;
		
		@BeforeClass
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new  ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().getPageLoadTimeout();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@BeforeClass
		public void pageObject() {
			loginPage = new LoginPage(driver);
			pim= new PimPage(driver);
			
		}	
	   @AfterClass
	   public void TearDownEnvirment() {
		   driver.quit();
	}
}
