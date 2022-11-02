package factorydrivers;

import org.openqa.selenium.WebDriver;

public class MainDriver {
    public static void main(String[]arg){

        DriverSelenium driverSelenium = FactoryDriver.initialize("FIREFOX");
        WebDriver webDriver =driverSelenium.createDriver();
        webDriver.get("https://www.github.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.close();
    }
}
