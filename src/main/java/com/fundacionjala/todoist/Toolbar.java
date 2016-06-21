package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Rosario Garcia
 */
public class Toolbar extends BasePage {

    @FindBy(id = "quick_add_task_holder")
    private WebElement quickAddTaskButton;

    public QuickAddTask clickAddTaskIcon(){
        quickAddTaskButton.click();
        return new QuickAddTask();
    }
}
