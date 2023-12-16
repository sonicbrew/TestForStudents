import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleClean {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

//        WebElement searchField = driver.findElement(By.name("q"));

//        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));


        searchField.sendKeys("QA");

        searchField.submit();

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("Our test just passed");

        driver.quit();

    }
}
