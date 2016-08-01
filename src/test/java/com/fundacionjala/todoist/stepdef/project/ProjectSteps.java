package com.fundacionjala.todoist.stepdef.project;

import com.fundacionjala.todoist.ProjectContainer;
import com.fundacionjala.todoist.Sidebar;
import com.fundacionjala.todoist.TodoistHome;
import cucumber.api.java.en.Given;

/**
 * Created by RosarioGarcia on 8/1/2016.
 */
public class ProjectSteps {
    private TodoistHome todoistHome;

    private Sidebar sidebar;

    private String projectName;

    private ProjectContainer projectContainer;
    public ProjectSteps(){
        projectName = "test project";
    }
    @Given("^I create a new project$")
    public void iCreateANewProject() {
        sidebar.switchDefault();
        sidebar.newProject();
        sidebar.setProjectNameTextField(projectName);
        projectContainer = sidebar.clickAddProjectButton();
    }

    public ProjectContainer getProjectContainer() {
        return projectContainer;
    }

    public Sidebar getSidebar() {
        return sidebar;
    }

    public String getProjectName() {
        return projectName;
    }
  
}
