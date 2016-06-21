package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class ProjectContainer extends BasePage {

    @FindBy(className = "project_link")
    private WebElement projectNameTitle;

    @FindBy(id = "editor")
    private WebElement editorContainer;
    //review
    @FindBy(xpath = "html/body/div[2]/div[3]/div/div/div[1]/ul/li[2]/table/tbody/tr/td[2]/span")
    private WebElement task;
    //review
    @FindBy(xpath = "html/body/div[2]/div[3]/div/div/div[2]/a")
    private WebElement addTaskLink;





    public String getProjectNameTitle() {
        return projectNameTitle.getText();
    }


    public String getEditorContainer() {
        return editorContainer.getText();
    }

    public String getTaskName() {
        return task.getText();
    }

    public TaskWindow clickOnAddTask(){
        addTaskLink.click();
        return new TaskWindow();
    }




}
