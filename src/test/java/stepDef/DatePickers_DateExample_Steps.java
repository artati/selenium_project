package stepDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Setup;
import pages.DatePickers;
import static org.junit.Assert.assertEquals;

public class DatePickers_DateExample_Steps {
    DatePickers datePickers = new DatePickers();

    @Given("^the page url Date Pickers Example \"([^\"]*)\"$")
    public void the_page_url_Date_Pickers_Example(String arg1) throws Throwable {
        Setup.init(arg1);
    }

    @When("^I select an Active Day from Calendar$")
    public void i_select_an_Active_Day_from_Calendar() throws Throwable {
        datePickers.clickDateTable();
        datePickers.selectTheTodayDay();
    }

    @When("^I click the Clear Button$")
    public void i_click_the_Clear_Button() throws Throwable {
        datePickers.clickDateTable();
        datePickers.clickButtonClear();
    }

    @When("^I click on the Today Button$")
    public void i_click_on_the_Today_Button() throws Throwable {
        datePickers.clickDateTable();
        datePickers.clickButtonToday();
    }

    @Then("^I see the Date Selected for both actions$")
    public void i_see_the_Date_Selected_for_both_actions() throws Throwable {
        datePickers.clickDateTable();
        String my_element = datePickers.todayActiveDay.getText();
        assertEquals(my_element, datePickers.getCurrentDate());
        Setup.closeSession();
    }

}
