package com.fundacionjala.todoist;

/**
 * Created by RosarioGarcia on 6/20/2016.
 */
public class TodoistMain extends BasePage{

    private Sidebar sidebar;

    private Toolbar toolbar;

    public TodoistMain(){
        sidebar = new Sidebar();
        toolbar = new Toolbar();
    }

    public Sidebar getSidebar() {
        return sidebar;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }
    
}
