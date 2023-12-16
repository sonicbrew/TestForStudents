import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static org.testng.AssertJUnit.assertTrue;

public class GoogleSearchAdvanced {
     WebDriver driver = new ChromeDriver();

     @BeforeTest
     public void setUp(){
         System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");
         this.driver = new ChromeDriver();
     }

    @Test
    public void test001() {
        openMainPage();
        findElementAndSendKeys();
        waitForResults();
        assertResultPage();
    }
    private void openMainPage(){
        String url = "https://www.google.com/";
        driver.get(url);
    }
    private void findElementAndSendKeys() {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("QA Tester");
        searchInput.submit();
    }
    private void waitForResults(){
        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsStatsElement));
    }
    private void assertResultPage(){
        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));
        System.out.println("You found information related to QA testers");
    }

    @AfterTest
    public void cleanUp(){
        if (driver !=null)
            driver.quit();
    }
}