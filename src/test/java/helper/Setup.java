package helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
        public static WebDriver driver=new ChromeDriver();
        public static void init(String url){
                driver.get(url);
                driver.manage().window().maximize();
        }
        public static void closeSession() {
                driver.quit();
        }
}
