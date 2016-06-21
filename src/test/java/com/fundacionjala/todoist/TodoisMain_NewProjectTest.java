package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoisMain_NewProjectTest {
    private TodoistHome todoistHome;
    private Sidebar sidebar;
    private ProjectContainer projectContainer;
    String projectName = "test project";
    @Before
    public void setUp(){
        final String email = "rosi_15_27@hotmail.com";
        final String p4ssw0rd = "P4ssw0rd";
        sidebar = LoginFrame.loginAS(email, p4ssw0rd);
    }

    @Test
    public void testNewProject(){
        sidebar.switchDefault();
        sidebar.newProject();
        sidebar.setProjectNameTextField(projectName);
        projectContainer = sidebar.clickAddProjectButton();
        assertEquals(projectName, projectContainer.getProjectNameTitle());
    }

    @After
    public void postCondition(){
        sidebar.searchProjectCreated(projectName);
        sidebar.clickOnMenuProject();
        sidebar.clickOnDeletProjectOption();
        sidebar.confirmDeleteProject();
    }
}
