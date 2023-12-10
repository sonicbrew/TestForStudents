import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Google {
    public static void main(String[] args) {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Where are we going? Method GET
        driver.get("http://www.google.com");

        // text input element. Create instance of element. Finding element BY NAME
//        WebElement elementByName = driver.findElement(By.name("q"));

        // text input element. Create instance of element. Finding element BY CSS SELECTOR
//        WebElement element=driver.findElement(By.cssSelector("#APjFqb"));

        // text input element. Create instance of element. Finding element BY xpath
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        // text input element. Create instance of element. Finding element BY full xpath
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));

        // Enter what are we looking for. SEND KEYS
        element.sendKeys("Quality assurance");

        // Now submit the form
        element.submit();

        //Close the browser. Close the window.
        driver.quit();
    }
}
