package stepDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Setup;
import pages.InputForms;
import static org.junit.Assert.*;

public class InputForms_TwoInputFields_Steps {
    InputForms inputForm = new InputForms();
    int calculateSum;

    @Given("^the page url Two Input Fields \"([^\"]*)\"$")
    public void the_page_url_Two_Input_Fields(String arg1) throws Throwable {
       Setup.init(arg1);
    }

    @When("^I add \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_add_and(String arg1, String arg2) throws Throwable {
        inputForm.enterValue1(arg1);
        inputForm.enterValue2(arg2);
        calculateSum =  inputForm.calculateTotal(arg1,arg2);
    }

    @When("^I press -Get Total button$")
    public void i_press_Get_Total_button() throws Throwable {
        inputForm.clickGetTotal();
    }

    @Then("^The sum is \"([^\"]*)\"$")
    public void the_sum_is(String arg1) throws Throwable {
        int sum_displayed = inputForm.convertSumIntoInt();
        int sum_feature = Integer.parseInt(arg1);
        assertEquals(sum_feature, sum_displayed);
        assertEquals(sum_feature, calculateSum);
        Setup.closeSession();
    }
}
