package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Charito on 6/21/2016.
 */
public class ToolBar_AddTask {
    private TodoistHome todoistHome;
    private Sidebar sidebar;
    private ProjectContainer projectContainer;
    String projectName = "test project";
    private Toolbar toolbar;
    @Before
    public void setUp(){
        final String email = "rosi_15_27@hotmail.com";
        final String p4ssw0rd = "P4ssw0rd";
        sidebar = LoginFrame.loginAS(email, p4ssw0rd);
        sidebar.switchDefault();
        sidebar.newProject();
        sidebar.setProjectNameTextField(projectName);
        sidebar.clickAddProjectButton();
    }

    @Test
    public void testNewProject(){
        toolbar = new Toolbar();
        toolbar.clickAddTaskIcon();
        String taskName = "task";
        toolbar.setTaskName(taskName);
        projectContainer = toolbar.clickOnAddTaskButton();
        assertEquals("The task name is different", taskName, projectContainer.getTaskName());
    }

    @After
    public void postCondition(){
        sidebar.searchProjectCreated(projectName);
        sidebar.clickOnMenuProject();
        sidebar.clickOnDeletProjectOption();
        sidebar.confirmDeleteProject();
    }
}
