package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInstance {
    public static WebDriver driver;

    public DriverInstance()
    {

    }

    public static WebDriver getInstance() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            // ✅ Use a unique temporary user-data directory
            String userDataDir = System.getProperty("java.io.tmpdir") + "/chrome_profile_" + System.currentTimeMillis();
            options.addArguments("--user-data-dir=" + userDataDir);

            // ✅ Add these for better compatibility
            options.addArguments("--remote-allow-origins=*");  // Fix for ChromeDriver issues
            options.addArguments("--disable-dev-shm-usage");   // Prevents crashes in Docker/Linux
            options.addArguments("--no-sandbox");              // Required for some environments

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
