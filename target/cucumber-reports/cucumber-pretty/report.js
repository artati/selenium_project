$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("InputForms.feature");
formatter.feature({
  "line": 2,
  "name": "Input Forms",
  "description": "As an user\r\nI want to test all the input forms",
  "id": "input-forms",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Single Input Field",
  "description": "",
  "id": "input-forms;single-input-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the page url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill the field \"Enter Message\": \"First Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press \"Show Message\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see my message displayed \"First Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InputForms_Steps.the_page_url()"
});
formatter.result({
  "duration": 7928491385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter Message",
      "offset": 18
    },
    {
      "val": "First Test",
      "offset": 35
    }
  ],
  "location": "InputForms_Steps.i_fill_the_field(String,String)"
});
formatter.result({
  "duration": 272851875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show Message",
      "offset": 9
    }
  ],
  "location": "InputForms_Steps.i_press_button(String)"
});
formatter.result({
  "duration": 93742882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Test",
      "offset": 28
    }
  ],
  "location": "InputForms_Steps.i_see_my_message_displayed(String)"
});
formatter.result({
  "duration": 59947714,
  "status": "passed"
});
});