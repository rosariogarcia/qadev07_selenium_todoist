Feature: Create project
  Background: Login todoist
    Given I login with valid credentials
    Then I expect the filterBox displayed

  @Project
  Scenario: Create Project
    Given I create a new project
    Then I expect the name created

  