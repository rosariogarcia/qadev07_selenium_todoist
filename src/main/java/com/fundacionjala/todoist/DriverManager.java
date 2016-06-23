package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class DriverManager {

    private static DriverManager instance;
    private WebDriver driver;

    private DriverManager() {
        initWebDriver();
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public void initWebDriver() {
        //driver = FactoryDriver.getDriver(BROWSER).initDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
