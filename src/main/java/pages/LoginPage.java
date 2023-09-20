package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import testData.TestData;
import base.Base;
import model.CommonMethods;
import model.LoginLocators;

public class LoginPage extends Base {
	
	RemoteWebDriver driver;
	TestData testData = new TestData();
	CommonMethods commonMethods;
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		commonMethods = new CommonMethods(this.driver);
	}
	
	public void openPotal() {
		driver.get(testData.base_url);
	}
	
	public void inputUsername() {
		commonMethods.waitForElement(LoginLocators.inputUsername);
		commonMethods.typeText(LoginLocators.inputUsername, testData.loginUsername);
	}
	
	public void inputPassword() {
		commonMethods.typeText(LoginLocators.inputPassword, testData.loginPassword);
	}
	
	public void clickLogninBtn() {
		commonMethods.clickAnything(LoginLocators.clickLoginBtn);
	}

}
