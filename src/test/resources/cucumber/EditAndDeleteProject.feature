Feature: Edit project
  Background: Login todoist
    Given I login with valid credentials
    Then I expect the filterBox displayed
    And I create a new project
    Then I expect the name created

  @Project
  Scenario: Edit Project
    Given I select the project
    Then I expect the name created