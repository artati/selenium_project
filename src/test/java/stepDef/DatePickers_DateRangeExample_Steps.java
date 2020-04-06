package stepDef;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DatePickers;

import static org.junit.Assert.assertEquals;

public class DatePickers_DateRangeExample_Steps {

    public WebDriver driver = new ChromeDriver();
    DatePickers datePickers = new DatePickers(driver);


    @Given("^the page url Date Pickers Range Example \"([^\"]*)\"$")
    public void the_page_url_Date_Pickers_Example(String arg1) throws Throwable {
        driver.get(arg1);
    }

    @When("^I select an Start Date$")
    public void i_select_an_Start_Date() throws Throwable {
        datePickers.clickStartDateTable();
        datePickers.selectTheStartDate();
    }

    @When("^I select an End Date$")
    public void i_select_an_End_Date() throws Throwable {
        datePickers.clickEndDateTable();
        datePickers.selectThEndDate();
    }

    @Then("^The Selected Dates are Displayed$")
    public void the_Selected_Dates_are_Displayed() throws Throwable {
    }
    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
