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
        sidebar = LoginFrame.loginAsPrimaryUser();
    }

    @Test
    public void testLogin() {
        assertEquals("Inbox is not displayed","Inbox", sidebar.getFilterInbox());
    }
}
