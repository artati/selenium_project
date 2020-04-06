package stepDef;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InputForms;
import static org.junit.Assert.*;

public class InputForms_SingleInputField_Steps {
    public WebDriver driver = new ChromeDriver();
    InputForms inputForm = new InputForms(driver);
    String txt = "TC_SingleInputField_"+ RandomStringUtils.randomAlphanumeric(2);

    @Given("^the page url Single Input Field \"([^\"]*)\"$")
    public void the_page_url(String arg1) throws Throwable {
        driver.get(arg1);
        inputForm = new InputForms(driver);
    }

    @When("^I fill the field - Single Input Field$")
    public void i_fill_the_field() throws Throwable {
        inputForm.enterUserMessage(txt);
    }

    @And("^I press -Show Message button$")
    public void i_press_button() throws Throwable {
        inputForm.clickShowMessage();
    }

    @Then("^I see my message displayed$")
    public void i_see_my_message_displayed() throws Throwable {
        String my_element = inputForm.displayMyText.getText();
        assertEquals(my_element, txt);
    }
}
