package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.MarketPage;

public class MarketTests extends LoginTests {
	RemoteWebDriver driver;
	
	@Test (priority=2)
	public void AddToCart() {
		driver = super.getActiveDriver();
		MarketPage marketPage = new MarketPage(driver);
		
		System.out.println("Add products to cart");
		
		marketPage.viewFirstProduct();
		//Thread.sleep(3000);
		
		marketPage.addFirstProduct();
		//Thread.sleep(3000);
		
		marketPage.sortAtoZ();
		//Thread.sleep(3000);
		
		marketPage.addSecondProduct();
		//Thread.sleep(3000);
	}

}
