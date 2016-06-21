package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class ProjectContainer_AddTask {
    private TodoistHome todoistHome;
    private Sidebar sidebar;
    private ProjectContainer projectContainer;
    String projectName = "test project";
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
        projectContainer = new ProjectContainer();
        projectContainer.clickOnAddTask();
        String taskName = "task Container";
        projectContainer.setTaskNameTextField(taskName);
        projectContainer.clickOnAddTaskButton();
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
