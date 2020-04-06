@InputForms
Feature: Input Forms
  As an user
  I want to test all the input forms

@SingleInputField
  Scenario: Single Input Field
    Given the page url Single Input Field "https://www.seleniumeasy.com/test/basic-first-form-demo.html"
    When I fill the field - Single Input Field
    And I press -Show Message button
    Then I see my message displayed

@TwoInputFields
  Scenario Outline: Two Input Fields
    Given the page url Two Input Fields "https://www.seleniumeasy.com/test/basic-first-form-demo.html"
    When I add "<a>" and "<b>"
    And I press -Get Total button
    Then The sum is "<total>"

    Examples:
      | a  | b   | total |
      |101 |214  | 315 |
      |-3  |-4   | -7  |
      |-3  |4    | 1   |
