package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistMain_EditProjectTest {
    private TodoistHome todoistHome;
    private Sidebar sidebar;
    private ProjectContainer projectContainer;
    private String projectName = "test project";;
    private String newProjectName = "new name";;
    @Before
    public void setUp() {
        final String email = "rosi_15_27@hotmail.com";
        final String p4ssw0rd = "P4ssw0rd";
        sidebar = LoginFrame.loginAS(email, p4ssw0rd);
        sidebar.switchDefault();
        sidebar.newProject();
        sidebar.setProjectNameTextField(projectName);
        projectContainer = sidebar.clickAddProjectButton();
    }

    @Test
    public void testEditProject(){
        sidebar.searchProjectCreated(projectName);
        sidebar.clickOnMenuProject();
        sidebar.clickOnEditProjectOption();
        sidebar.setProjectNameTextField(newProjectName);
        sidebar.clickOnSaveChangesButton();
        assertEquals(newProjectName, projectContainer.getProjectNameTitle());
    }

    @After
    public void postCondition() {
        sidebar.searchProjectCreated(newProjectName);
        sidebar.clickOnMenuProject();
        sidebar.clickOnDeletProjectOption();
        sidebar.confirmDeleteProject();
    }
}
