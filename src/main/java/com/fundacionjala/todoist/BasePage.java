package com.fundacionjala.todoist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
     public void switchDefault(){
         driver.switchTo().defaultContent();
     }
}
