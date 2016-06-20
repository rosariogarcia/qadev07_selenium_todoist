package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class LoginFrameTest {

    private TodoistHome todoistHome;
    private TodoistMain todoistMain;
    @Before
    public void setUp(){
        todoistMain = LoginFrame.loginAS("rosi_15_27@hotmail.com", "P4ssw0rd");
    }

    @Test
    public void testLogin() {
       assertEquals("Inbox", todoistMain.getFilterInbox());
    }
}
