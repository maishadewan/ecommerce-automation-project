package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;
import model.CheckoutLocators;
import model.CommonMethods;
import testData.TestData;

public class CheckoutPage extends Base {
	
	RemoteWebDriver driver;
	CommonMethods commonMethods;
	TestData testData = new TestData();

	public CheckoutPage(RemoteWebDriver driver) {
		this.driver = driver;
		commonMethods = new CommonMethods(this.driver);
	}
	
	public void checkoutStart() {
		commonMethods.clickAnything(CheckoutLocators.cartBtn);
		commonMethods.clickAnything(CheckoutLocators.checkoutBtn);
	}
	
	public void formFillUp() {
		commonMethods.typeText(CheckoutLocators.inputFirstName, testData.firstName);
		commonMethods.typeText(CheckoutLocators.inputSecondName, testData.lastName);
		commonMethods.typeText(CheckoutLocators.inputZip, testData.zip);
		commonMethods.clickAnything(CheckoutLocators.continueBtn);
	}
	
	public void payment () {
		commonMethods.clickAnything(CheckoutLocators.finishBtn);
	}
	
	

}
