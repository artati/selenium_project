@LoginProfile
Feature: Input Forms
  As an user
  I want to test all the input forms

  Scenario: Single Input Field
    Given the page url
    When I fill the field "Enter Message": "First Test"
    And I press "Show Message" button
    Then I see my message displayed "First Test"
