package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	private enum Drivers {
		ChromeDriver,
		FirefoxFriver;
	}
	
	RemoteWebDriver activeDriver;
	public ChromeOptions option = new ChromeOptions();
	
	@BeforeTest
	public void setDriver() {
		
		option.addArguments("--remote-allow-origins=*");
		setActiveDriver(Drivers.ChromeDriver);
		
		activeDriver.manage().window().maximize();
		activeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	private void setActiveDriver(Drivers driver) {
		if (driver == Drivers.ChromeDriver) {
			activeDriver = new ChromeDriver(option);
		}
		else if (driver == Drivers.FirefoxFriver) {
			activeDriver = new FirefoxDriver();
		}
		
	}
	
	public RemoteWebDriver getActiveDriver(){
        return activeDriver;
    }
	
	@AfterTest
	public void closeBrowser() {
		
		activeDriver.close();
	}
	

}
