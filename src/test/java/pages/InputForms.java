package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InputForms {
    private WebDriver driver;

    @FindBy(id = "user-message")
    public WebElement txtUserMessage;

    @FindBy(xpath = "//button[contains(text(),'Show Message')]")
    public WebElement btnShowMessage;

    @FindBy(id = "display")
    public WebElement displayMyText;

    @FindBy(id = "sum1")
    public WebElement element_a;

    @FindBy(id = "sum2")
    public WebElement element_b;

    @FindBy(xpath = "//button[contains(text(),'Get Total')]")
    public WebElement btnGetTotal;

    @FindBy(xpath = "//span[@id='displayvalue']")
    public WebElement totalElement;

    public InputForms(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.driver.manage().window().maximize();
    }

    public void enterUserMessage(String userMessage){
        txtUserMessage.sendKeys(userMessage);
    }

    public void clickShowMessage(){
        btnShowMessage.click();
    }

    public void enterValue1(String a){ element_a.sendKeys(a);}
    public void enterValue2(String b){ element_b.sendKeys(b);}
    public void clickGetTotal(){ btnGetTotal.click();}

    public int calculateTotal(String a, String b){
        int a_int = Integer.parseInt(a);
        int b_int = Integer.parseInt(b);
        int total = a_int + b_int;
        return total;
    }

    public int convertSumIntoInt(){
        return Integer.parseInt(totalElement.getText());
    }
}
