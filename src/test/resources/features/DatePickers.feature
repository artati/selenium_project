@DatePickers
Feature: Bootstrap Date Pickers Example
  As an user
  I want to test all the date pickers

@DateExample
  Scenario: Select an Active Date
    Given the page url Date Pickers Example "https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html"
    When I select an Active Day from Calendar
    And I click the Clear Button
    And I click on the Today Button
    Then I see the Date Selected for both actions

@DateRangeExample
  Scenario: Select a Calendar Date from the Range
    Given the page url Date Pickers Range Example "https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html"
    When I select an Start Date
    And I select an End Date
    Then The Selected Dates are Displayed