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

    @FindBy(xpath = "html/body/div[2]/div[3]/div/div/div[1]/ul/li[2]/table/tbody/tr/td[2]/span")
    private WebElement task;

    @FindBy(xpath = "html/body/div[2]/div[3]/div/div/div[2]/a")
    private WebElement addTaskLink;

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement taskNameTextField;

    @FindBy(xpath = "html/body/div[2]/div[3]/div/div/div[1]/ul/li[2]/form/table[2]/tbody/tr/td[1]/a[1]/span")
    private WebElement addTaskButton;

    public String getProjectNameTitle() {
        return projectNameTitle.getText();
    }


    public String getEditorContainer() {
        return editorContainer.getText();
    }

    public String getTaskName() {
        return task.getText();
    }

    public ProjectContainer clickOnAddTask(){
        addTaskLink.click();
        return this;
    }

    public void setTaskNameTextField(String taskName){
        taskNameTextField.clear();
        taskNameTextField.sendKeys(taskName);
    }

    public ProjectContainer clickOnAddTaskButton(){
        addTaskButton.click();
        return this;
    }


}
