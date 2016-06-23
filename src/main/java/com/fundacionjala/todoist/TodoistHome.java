package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistHome extends BasePage {

    @FindBy(className = "sel_login")
    private WebElement signInLink;

    @FindBy(name = "GB_frame")
    private WebElement loginFrame;

    @FindBy(id = "GB_frame")
    private WebElement loginIFrame;

    public TodoistHome() {
        driver.get(PropertiesInfo.getInstance().getUrl());
    }

    public LoginFrame clickSigInLink() {
        signInLink.click();
        driver.switchTo().frame(loginFrame);
        driver.switchTo().frame(loginIFrame);
        return new LoginFrame();
    }
}
