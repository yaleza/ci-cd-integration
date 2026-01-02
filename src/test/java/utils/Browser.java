package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    private static WebDriver driverInstance = null;

    public static WebDriver getInstance() {
        if (driverInstance == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments(
                    "--headless=new",
                    "--no-sandbox",
                    "--disable-dev-shm-usage",
                    "--disable-gpu",
                    "--window-size=1920,1080"
            );
            driverInstance = new ChromeDriver(options);
        }
        return driverInstance;
    }

    public static void quitDriver(){
        if (driverInstance != null) {
            driverInstance.quit();
            driverInstance = null;
        }
    }
}