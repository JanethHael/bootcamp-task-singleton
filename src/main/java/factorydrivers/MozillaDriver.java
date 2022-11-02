package factorydrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaDriver implements DriverSelenium{
    @Override
    public WebDriver createDriver() {
        System.setProperty("webdriver.gecko.driver",System.getProperty("geckodriver"));
        return new FirefoxDriver();
    }
}
