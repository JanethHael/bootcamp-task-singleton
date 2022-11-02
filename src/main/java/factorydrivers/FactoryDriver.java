package factorydrivers;

public class FactoryDriver {
    public static DriverSelenium initialize(String driverName){
        DriverSelenium driver;
        switch (driverName){
            case "FIREFOX":driver= new MozillaDriver();break;
            case "CHROME":driver= new ChromerDriver();break;
            default: driver = null;break;
        }
        return driver;
    }
}
