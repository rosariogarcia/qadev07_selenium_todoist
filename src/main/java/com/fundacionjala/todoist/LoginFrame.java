package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class LoginFrame extends BasePage{

    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(css = ".amibutton.amibutton_red.sel_login")
    private WebElement logInButton;

    public void setEmailTextField(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }

    public void setPasswordTextField(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public Sidebar clickLogInButton() {
        logInButton.click();
        return new Sidebar();
    }

    public static Sidebar loginAS(String email, String password){
        TodoistHome todoistHome = new TodoistHome();
        Sidebar sidebar = new Sidebar();
        if (!sidebar.getFilterInbox().equals("Inbox")){
            LoginFrame login = todoistHome.clickSigInLink();
            login.setEmailTextField(email);
            login.setPasswordTextField(password);

            return login.clickLogInButton();
        }
        return sidebar;
    }

    public static Sidebar loginAsPrimaryUser(){
        PropInfo properties = new PropInfo();

        final String email = properties.getEmail();
        final String p4ssw0rd = properties.getPassword();
        return LoginFrame.loginAS(email, p4ssw0rd);
    }
}
