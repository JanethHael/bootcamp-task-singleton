package factorydrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromerDriver implements DriverSelenium{
    @Override
    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver");

        return new ChromeDriver();
    }
}
