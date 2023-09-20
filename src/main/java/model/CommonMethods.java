package model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	RemoteWebDriver driver;
	WebDriverWait wait;
	
	
	public CommonMethods(RemoteWebDriver driver){
        this.driver = driver;
    }
	
	public void typeText (By elmLocator, String inputText) {
		driver.findElement(elmLocator).sendKeys(inputText);
	}
	
	public void clickAnything (By elmLocator) {
		driver.findElement(elmLocator).click();	
	}
	
	public void keyboardAction (By elmLocator, Keys keys, Keys keys1) {
		driver.findElement(elmLocator).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}
	
	public void waitForElement (By elmLocator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(elmLocator));
		
	}
	

}
