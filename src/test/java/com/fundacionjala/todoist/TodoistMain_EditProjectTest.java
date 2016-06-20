package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistMain_EditProjectTest {
    private TodoistHome todoistHome;
    private TodoistMain todoistMain;
    @Before
    public void setUp(){
        todoistMain = LoginFrame.loginAS("rosi_15_27@hotmail.com", "P4ssw0rd");
        todoistMain.swithDefault();
        todoistMain.newProject();
        String projectName = "test project";
        todoistMain.setProjectNameTextField(projectName);
        todoistMain = todoistMain.clickAddProjectButton();
    }

    @Test
    public void testNewProject(){


    }

    @After
    public void postCondition(){

    }
}
