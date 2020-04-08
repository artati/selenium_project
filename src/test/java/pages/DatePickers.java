package pages;

import helper.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePickers extends Setup {

    public DatePickers() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver,this);
    }
    //All DatePickers Page Elements
    @FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
    public WebElement dateTable;

    @FindBy(xpath = "//td[@class='today day']")
    public WebElement selectTodayDay;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='today'][contains(text(),'Today')]")
    public WebElement buttonToday;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='clear'][contains(text(),'Clear')]")
    public WebElement buttonClear;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElement startDateTable;

    @FindBy(xpath = "//input[@placeholder='End date']")
    public WebElement endDateTable;

    @FindBy(xpath = "//td[contains(text(),'14')]")
    public WebElement selectStartDate;

    @FindBy(xpath = "//td[contains(text(),'16')]")
    public WebElement selectEndDate;

    @FindBy(xpath = "//td[@class='today active day']")
    public WebElement todayActiveDay;

    //All Actions with the DatePickers Page Elements

    public void clickDateTable(){
        dateTable.click();
    }

    public void selectTheTodayDay(){
        selectTodayDay.click();
    }

    public void clickButtonClear(){
        buttonClear.click();
    }

    public void clickButtonToday(){
        buttonToday.click();
    }

    public void clickStartDateTable(){
        startDateTable.click();
    }

    public void selectTheStartDate(){
        selectStartDate.click();
    }

    public void clickEndDateTable(){
        endDateTable.click();
    }

    public void selectThEndDate(){
        selectEndDate.click();
    }

    public String getCurrentDate() {
            // Create object of SimpleDateFormat class and decide the format
            DateFormat dateFormat = new SimpleDateFormat("d");
            //get current date time with Date()
            Date date = new Date();
            // Now format the date
            String date1= dateFormat.format(date);
            // Print the Date
            return date1;
        }

    }