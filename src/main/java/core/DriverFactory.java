package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}

	public static WebDriver getDriver(){
		if(driver == null) {
			switch (Propriedades.browser){
				case CHROME:
					System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
					driver = new ChromeDriver();
					break;
				case FIREFOX:
					System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					break;
			}
			driver.manage().window().setSize(new Dimension(1200, 765));
		}
		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
