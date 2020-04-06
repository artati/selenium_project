package stepDef;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InputForms;
import static org.junit.Assert.*;

public class InputForms_TwoInputFields_Steps {
    public WebDriver driver = new ChromeDriver();
    InputForms inputForm = new InputForms(driver);
    int calculateSum;

    @Given("^the page url Two Input Fields \"([^\"]*)\"$")
    public void the_page_url_Two_Input_Fields(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg1);
        inputForm = new InputForms(driver);
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
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

}
