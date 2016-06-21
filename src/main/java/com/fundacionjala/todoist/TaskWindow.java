package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/21/2016.
 */
public class TaskWindow extends BasePage{

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement taskNameTextField;

    @FindBy(css = ".amibutton.amibutton_red.submit_btn>span")
    private WebElement addTaskButton;

    @FindBy(xpath = "//img[@class='cmp_priority4 form_action_icon menu_icon']")
    private WebElement priorityFourFlag;

    @FindBy(xpath = "//img[@class='cmp_priority1']")
    private WebElement priorityOneFlag;

    public void setTaskNameTextField(String taskName){
        taskNameTextField.clear();
        taskNameTextField.sendKeys(taskName);
    }

    public ProjectContainer clickOnAddTaskButton(){
        addTaskButton.click();
        return new ProjectContainer();
    }

    public void setToPriorityOne(){
        priorityFourFlag.click();
        priorityOneFlag.click();
    }
}
