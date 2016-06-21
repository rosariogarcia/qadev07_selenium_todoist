package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistMain_DeleteProject {
    private Sidebar sidebar;
    private ProjectContainer projectContainer;
    private String projectName;
    @Before
    public void setUp() {
        final String email = "rosi_15_27@hotmail.com";
        final String p4ssw0rd = "P4ssw0rd";
        sidebar = LoginFrame.loginAS(email, p4ssw0rd);
        sidebar.switchDefault();
        sidebar.newProject();
        projectName = "test project";
        sidebar.setProjectNameTextField(projectName);
        projectContainer = sidebar.clickAddProjectButton();
        sidebar.searchProjectCreated(projectName);
        sidebar.clickOnMenuProject();
    }

    @Test
    public void testEditProject(){
        sidebar.clickOnDeletProjectOption();
        projectContainer = sidebar.confirmDeleteProject();
        assertEquals("", projectContainer.getEditorContainer());
    }
}
