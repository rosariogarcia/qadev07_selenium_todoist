package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistMain extends BasePage{

    @FindBy(id = "filter_inbox")
    private WebElement filterInbox;

    @FindBy(linkText = "Add Project")
    private WebElement addProjectLink;

    @FindBy(className = "sel_richtext_editor")
    private WebElement projectNameTextField;

    @FindBy(className = "submit_btn")
    private WebElement addProjectButton;

    @FindBy(className = "project_link")
    private WebElement projectNameTitle;

    public String getFilterInbox() {
        String filterText = "";
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            filterText = filterInbox.getText();
        }
        catch (NoSuchElementException e){

        }
        finally {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return filterText;
    }

    public void newProject(){
        addProjectLink.click();
    }

    public void setProjectNameTextField(String newProjectName) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(newProjectName);
    }

    public TodoistMain clickAddProjectButton(){
        addProjectButton.click();
        return this;
    }

    public String getProjectNameTitle() {
        return projectNameTitle.getText();
    }

    public void clickSettingsProjectButton(){

    }
    
}
