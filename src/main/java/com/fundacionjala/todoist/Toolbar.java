package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Rosario Garcia
 */
public class Toolbar extends Sidebar {

    @FindBy(id = "quick_add_task_holder")
    private WebElement addTaskIcon;

    @FindBy(xpath = "html/body/div[19]/div/div[2]/div/div/div/form/table[1]/tbody/tr/td/table/tbody/tr/td[1]/div")
    private WebElement taskNameTextField;

    @FindBy(className = "td_submit")
    private WebElement addTaskButton;

    public Toolbar clickAddTaskIcon(){
        addTaskIcon.click();
        return this;
    }

    public void setTaskName(String taskName){
        //taskNameTextField.clear();
        taskNameTextField.sendKeys(taskName);
    }

    public ProjectContainer clickOnAddTaskButton(){
        addTaskButton.click();
        return new ProjectContainer();
    }


}
