package com.fundacionjala.todoist.stepdef.project;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 8/1/2016.
 */
public class ProjectAsserts {
    
    private ProjectSteps projectSteps;
    
    public ProjectAsserts(ProjectSteps projectSteps){
        this.projectSteps = projectSteps;
    }

    @Then("^I expect the (.*) created$")
    public void iExpectTheNameCreated(String expectedName) {
        expectedName = "test project";
        assertEquals(expectedName, projectSteps.getProjectContainer().getProjectNameTitle());
    }
}
