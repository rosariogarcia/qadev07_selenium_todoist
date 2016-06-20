package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoisMain_NewProjectTest {
    private TodoistHome todoistHome;
    private TodoistMain todoistMain;
    @Before
    public void setUp(){
        todoistMain = LoginFrame.loginAS("rosi_15_27@hotmail.com", "P4ssw0rd");
    }

    @Test
    public void testNewProject(){
        todoistMain.swithDefault();
        todoistMain.newProject();
        String projectName = "test project";
        todoistMain.setProjectNameTextField(projectName);
        todoistMain = todoistMain.clickAddProjectButton();
        Assert.assertEquals(projectName, todoistMain.getProjectNameTitle());

    }

    @After
    public void postCondition(){

    }
}
