package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.LogoutPage;

public class LogoutTests extends CheckoutTest {
	
	RemoteWebDriver driver;
	
	@Test (priority=4)
	public void LogoutFromSauceDemo() {
		driver = super.getActiveDriver();
		LogoutPage logoutPage = new LogoutPage(driver);
		
		System.out.println("logout.");
		
		logoutPage.logout();
		//Thread.sleep(3000);
		
	}

}
