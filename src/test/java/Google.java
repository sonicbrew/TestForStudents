import org.openqa.selenium.chrome.ChromeDriver;
//This allows your program to use the `ChromeDriver` class,
// which is a WebDriver implementation that controls a Chrome browser running on the desktop.
import org.openqa.selenium.WebDriver;
//This allows your program to use the `WebDriver` interface, which represents an idealized web browser.
import org.openqa.selenium.WebElement;
//This allows your program to use the `WebElement` interface, which represents an HTML element. Basically,
// this is what you interact with via your WebDriver instance. You can click on it, input text, extract text, and so on.

import org.openqa.selenium.By;
//This allows your program to use the `By` class, which makes it possible to locate a set of WebElements on the page.
// This class has various static methods, like `By.className(String)
public class Google {
    public static void main(String[] args) {

        //The line `public static void main(String[] args)` is the main method in Java, serving as the entry point for any Java application. Here's what it means:
        //1. `public`: This is an access modifier, meaning the method is accessible to all classes.
        //2. `static`: This keyword means that the method belongs to the class, as opposed to an instance of the class. You can call the method without creating an object of the class.
        //3. `void`: This keyword means that the method doesn't return anything.
        //4. `main`: This is the name of the method. "main" is a special name that is recognized by the Java Virtual Machine (JVM) as the entry point of the application.
        //5. `String[] args`: This is the parameter to the main method. The `String[] args` parameter is an array of `String`s, which contains any command-line arguments that were passed when the program started

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Where are we going? Method GET
        driver.get("http://www.google.com");

        // text input element. Create instance of element. Finding element BY NAME
//        WebElement element = driver.findElement(By.name("q"));

        // text input element. Create instance of element. Finding element BY CSS SELECTOR
        WebElement element=driver.findElement(By.cssSelector("#APjFqb"));

        // text input element. Create instance of element. Finding element BY xpath
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        // text input element. Create instance of element. Finding element BY full xpath
//        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));

        // Enter what are we looking for. SEND KEYS
        element.sendKeys("QA");

        // Now submit the form
        element.submit();

        //Close the browser. Close the window.
        driver.quit();
    }
}
