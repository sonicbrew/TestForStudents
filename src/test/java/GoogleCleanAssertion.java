import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleCleanAssertion {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.sendKeys("QA");

        searchField.submit();

        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsStatsElement));

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("Our test just passed");

        driver.quit();

    }
}
