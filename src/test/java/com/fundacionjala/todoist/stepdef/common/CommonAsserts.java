package com.fundacionjala.todoist.stepdef.common;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 8/1/2016.
 */
public class CommonAsserts {
    
    private CommonSteps commonSteps;

    public CommonAsserts(CommonSteps commonSteps){
        this.commonSteps = commonSteps;
    }
    
    @Then("^I expect the filterBox displayed$")
    public void iExpectTheFilterBoxDisplayed() {
        assertEquals("Inbox is not displayed","Inbox", commonSteps.getSidebar().getFilterInbox());
    }
}
