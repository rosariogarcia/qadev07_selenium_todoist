package com.fundacionjala.todoist.hooks;

import com.fundacionjala.todoist.stepdef.project.ProjectSteps;
import cucumber.api.java.After;


/**
 * Created by RosarioGarcia on 8/1/2016.
 */
public class ProjectHook {
    private ProjectSteps projectSteps;
    
    public ProjectHook(ProjectSteps projectSteps){
        this.projectSteps = projectSteps;
    }
    
    @After("@project")
    public void postCondition(){
        projectSteps.getSidebar().searchProjectCreated(projectSteps.getProjectName());
        projectSteps.getSidebar().clickOnMenuProject();
        projectSteps.getSidebar().clickOnDeletProjectOption();
        projectSteps.getSidebar().confirmDeleteProject();
    }
}
