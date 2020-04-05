@LoginProfile
Feature: Input Forms
  As an user
  I want to test all the input forms

  Scenario: Single Input Field
    Given the page url "https://www.seleniumeasy.com/test/basic-first-form-demo.html"
    When I fill the field - Single Input Field
    And I press -Show Message button
    Then I see my message displayed
