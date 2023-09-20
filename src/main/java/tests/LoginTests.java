package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import base.Base;
import pages.LoginPage;
import testData.TestData;

public class LoginTests extends Base {
	RemoteWebDriver driver;
	TestData testData = new TestData();
	
	
	@Test (priority=1)
	public void loginToSauceDemo() {
		
		driver = super.getActiveDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		
		System.out.println("Start to login");
		
		loginPage.openPotal();
		//Thread.sleep(3000);
		
		loginPage.inputUsername();
		//Thread.sleep(3000);
		
		loginPage.inputPassword();
		//Thread.sleep(3000);
		
		loginPage.clickLogninBtn();
		//Thread.sleep(3000);
		
		
	}

}
