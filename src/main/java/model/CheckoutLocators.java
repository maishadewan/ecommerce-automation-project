package model;

import org.openqa.selenium.By;

public class CheckoutLocators {
	
	public static By cartBtn = By.cssSelector("a[class='shopping_cart_link']");
	public static By checkoutBtn = By.cssSelector("button[id='checkout']");
	
	public static By inputFirstName = By.cssSelector("input[placeholder='First Name']");
	public static By inputSecondName = By.cssSelector("input[placeholder='Last Name']");
	public static By inputZip = By.cssSelector("input[placeholder='Zip/Postal Code']");
	public static By continueBtn = By.cssSelector("input[id='continue']");
	public static By finishBtn = By.cssSelector("button[id='finish']");
	public static By completeText = By.cssSelector("h2[class='complete-header']");
	

}
