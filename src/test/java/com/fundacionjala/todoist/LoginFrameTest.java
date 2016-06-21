package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author RosarioGarcia.
 */
public class LoginFrameTest {

    private TodoistHome todoistHome;
    private Sidebar sidebar;

    @Before
    public void setUp() {
        final String email = "rosi_15_27@hotmail.com";
        final String p4ssw0rd = "P4ssw0rd";
        sidebar = LoginFrame.loginAS(email, p4ssw0rd);
    }

    @Test
    public void testLogin() {
        assertEquals("Inbox is not displayed","Inbox", sidebar.getFilterInbox());
    }
}
