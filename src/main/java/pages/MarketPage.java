package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;
import model.CommonMethods;
import model.MarketLocators;

public class MarketPage extends Base {
	
	RemoteWebDriver driver;
	CommonMethods commonMethods;
	
	public MarketPage(RemoteWebDriver driver) {
		this.driver = driver;
		commonMethods = new CommonMethods(this.driver);
	}
	
	public void viewFirstProduct() {
		commonMethods.clickAnything(MarketLocators.Product1View);
	}
	
	public void addFirstProduct() {
		commonMethods.clickAnything(MarketLocators.Product1Add);
	}
	
	public void sortAtoZ() {
		commonMethods.clickAnything(MarketLocators.BackBtn);
		commonMethods.keyboardAction(MarketLocators.SortBtn, null, null);
	}
	
	public void addSecondProduct() {
		commonMethods.clickAnything(MarketLocators.Product2Add);
	}

}
