@test1
Feature: testing
  Scenario: Testing Scenario1
    Given navigate to url "Sereapp"
    When Login to app
    Then verify title

  Scenario: Testing Scenario2
    Given navigate to url "Sereapp1"
    Then verify title
