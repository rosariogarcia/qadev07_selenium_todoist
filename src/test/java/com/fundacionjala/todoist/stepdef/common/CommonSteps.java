package com.fundacionjala.todoist.stepdef.common;

import com.fundacionjala.todoist.LoginFrame;
import com.fundacionjala.todoist.ProjectContainer;
import com.fundacionjala.todoist.Sidebar;
import com.fundacionjala.todoist.TodoistHome;
import cucumber.api.java.en.Given;

/**
 * Created by RosarioGarcia on 8/1/2016.
 */
public class CommonSteps {

    private TodoistHome todoistHome;

    private Sidebar sidebar;
    private ProjectContainer projectContainer;

    private String projectName = "test project";

    @Given("^I login with valid credentials$")
    public void iLoginWithValidCredentials() {
        sidebar = LoginFrame.loginAsPrimaryUser();
    }

    public Sidebar getSidebar() {
        return sidebar;
    }


}
