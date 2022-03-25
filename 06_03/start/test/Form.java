import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\LinkedInLearning\\Slenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        ConfirmationPage confirmationpage = new ConfirmationPage();
        formPage.submitForm(driver);
        confirmationpage.waitAlertBannerText(driver);





        assertEquals("The form was successfully submitted!", confirmationpage.getAlertBannerText(driver));

        driver.quit();
    }
}
