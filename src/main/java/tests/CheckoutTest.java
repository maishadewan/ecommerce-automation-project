package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.CheckoutPage;

public class CheckoutTest extends MarketTests {
	
	RemoteWebDriver driver;
	
	@Test (priority=3)
	public void checkout() {
		driver= super.getActiveDriver();
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		System.out.println("complete checkout");
		
		checkoutPage.checkoutStart();
		//Thread.sleep(3000);
		
		checkoutPage.formFillUp();
		//Thread.sleep(3000);
		
		checkoutPage.payment();
		//Thread.sleep(3000);
	}

}
