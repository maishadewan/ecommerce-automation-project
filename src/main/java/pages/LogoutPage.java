package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;
import model.LogoutLocators;
import model.CommonMethods;
import testData.TestData;

public class LogoutPage extends Base {
	
	RemoteWebDriver driver;
	CommonMethods commonMethods;
	TestData testData = new TestData();

	public LogoutPage(RemoteWebDriver driver) {
		this.driver = driver;
		commonMethods = new CommonMethods(this.driver);
	}
	
	public void logout() {
		commonMethods.clickAnything(LogoutLocators.hamburgerMenuBtn);
		commonMethods.clickAnything(LogoutLocators.logoutBtn);
	}

}
