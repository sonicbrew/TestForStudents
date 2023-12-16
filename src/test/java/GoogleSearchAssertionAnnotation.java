import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleSearchAssertionAnnotation {

    @Test
    public void test001() {
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com/";
        driver.get(url);

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("QA Tester");
        searchInput.submit();

        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsStatsElement));

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Manual"));
        System.out.println("You found information related to QA testers");

        driver.quit();

    }
}