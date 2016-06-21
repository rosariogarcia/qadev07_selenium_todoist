package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class LoginFrame extends BasePage{

    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(xpath = ".//*[@id='login_form']/dl/dd[3]/a")//review
    private WebElement logInButton;

    public void setEmailTextField(String email) {
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }

    public void setPasswordTextField(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    //modify too
    public Sidebar clickLogInButton() {
        logInButton.click();
        return new Sidebar();
    }

    //modify here with assert email account

    public static Sidebar loginAS(String email, String password){
        TodoistHome todoistHome = new TodoistHome();
        Sidebar sidebar = new Sidebar();
        if (!sidebar.getFilterInbox().equals("Inbox")){
            //todoistMain.logOut();
            LoginFrame login = todoistHome.clickSigInLink();
            login.setEmailTextField(email);
            login.setPasswordTextField(password);
            return login.clickLogInButton();
        }
        return sidebar;
    }
}
