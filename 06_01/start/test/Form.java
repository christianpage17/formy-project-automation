import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\LinkedInLearning\\Slenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement input_firstName = driver.findElement(By.id("first-name"));
        WebElement input_lastname = driver.findElement(By.id("last-name"));
        WebElement input_jobtitle = driver.findElement(By.id("job-title"));
        WebElement radio_education = driver.findElement(By.id("radio-button-1"));
        WebElement check_sex = driver.findElement(By.id("checkbox-1"));
        WebElement select_experience = driver.findElement(By.id("select-menu"));
        WebElement dp_date = driver.findElement(By.id("datepicker"));

        input_firstName.sendKeys("Christian");
        input_lastname.sendKeys("Page");
        input_jobtitle.sendKeys("QA");
        radio_education.click();
        check_sex.click();
        select_experience.click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("04-01-2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        driver.quit();
    }
}
