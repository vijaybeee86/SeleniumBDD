package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInstance {
    public static WebDriver driver;

    public DriverInstance()
    {

    }

    public static WebDriver getInstance()
    {
        if(driver == null)
        {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
