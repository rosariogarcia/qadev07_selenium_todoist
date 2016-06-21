package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class Sidebar extends BasePage{

    @FindBy(id = "filter_inbox")
    private WebElement filterInbox;

    @FindBy(linkText = "Add Project")
    private WebElement addProjectLink;

    @FindBy(className = "sel_richtext_editor")
    private WebElement projectNameTextField;

    @FindBy(className = "submit_btn")
    private WebElement addProjectButton;

    @FindBy(xpath = "html/body/div[5]/table/tbody/tr[4]/td/div/span")
    private WebElement editProjectOption;

    @FindBy(xpath = "html/body/div[2]/div[2]/div[2]/div[2]/ul/li[7]/form/table[1]/tbody/tr/td[1]/table/tbody/tr/td/div[2]")
    private WebElement newProjectNameTextField;

    @FindBy(xpath = "html/body/div[2]/div[2]/div[2]/div[2]/ul/li[7]/form/table[2]/tbody/tr/td[1]/a[1]/span")
    private WebElement saveChangesButton;

    @FindBy(id = "menu_delete_text")
    private WebElement deleteProjectOption;

    @FindBy(xpath = "html/body/div[19]/div/div[2]/div/div/div/center/div/a[1]/span")
    private WebElement confirmDeleteButton;

    private WebElement project;

    public void newProject() {
        addProjectLink.click();
    }

    public String getFilterInbox() {
        String filterText = "";
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            filterText = filterInbox.getText();
        } catch (NoSuchElementException e) {

        } finally {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return filterText;
    }

    public void setProjectNameTextField(String newProjectName) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(newProjectName);
    }

    public ProjectContainer clickAddProjectButton() {
        addProjectButton.click();
        return new ProjectContainer();
    }

    public Sidebar searchProjectCreated(String projectName) {
        String xpathProject = "//ul[@id='project_list']/descendant::span[text()='" + projectName + "']";
        project = driver.findElement(By.xpath(xpathProject));
        return this;
    }

    public Sidebar clickOnMenuProject(){
        Actions action = new Actions(driver).contextClick(project);
        action.build().perform();
        return this;
    }

    public Sidebar clickOnEditProjectOption(){
        editProjectOption.click();
        return  this;
    }

    public ProjectContainer clickOnSaveChangesButton(){
        saveChangesButton.click();
        return new ProjectContainer();
    }

    public Sidebar clickOnDeletProjectOption(){
        deleteProjectOption.click();
        return this;
    }

    public ProjectContainer confirmDeleteProject(){
        confirmDeleteButton.click();
        return new ProjectContainer();
    }
}
