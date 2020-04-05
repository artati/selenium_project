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

}
