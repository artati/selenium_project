package stepDef;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InputForms;

import static org.junit.Assert.*;

public class InputForms_Steps {
    InputForms inputForm;
    WebDriver driver= new ChromeDriver();
    String txt = "First Test";

    @Given("^the page url$")
    public void the_page_url() throws Throwable {
        inputForm = new InputForms(driver);
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @When("^I fill the field \"([^\"]*)\": \"([^\"]*)\"$")
    public void i_fill_the_field(String arg1, String arg2) throws Throwable {
        inputForm.enterUserMessage(txt);
    }

    @And("^I press \"([^\"]*)\" button$")
    public void i_press_button(String arg1) throws Throwable {
        inputForm.clickShowMessage();
    }

    @Then("^I see my message displayed \"([^\"]*)\"$")
    public void i_see_my_message_displayed(String arg1) throws Throwable {
        String my_element = inputForm.displayMyText.getText();
        assertEquals(my_element, txt);
    }


}
