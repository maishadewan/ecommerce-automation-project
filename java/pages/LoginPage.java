package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import testData.TestData;
import base.Base;
//import model.CommonMethods;

public class LoginPage extends Base {
	
	RemoteWebDriver driver;
	TestData testData = new TestData();
	//CommonMethods commonMethods;
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		//commonMethods = new CommonMethods(this.driver);
	}
	
	public void openPotal() {
		driver.get(testData.base_url);
	}
	
	public void openLoginPage() {
		
	}
	
	

}
