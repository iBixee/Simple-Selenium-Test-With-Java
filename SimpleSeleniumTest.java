import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSeleniumTest {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Create an instance of the WebDriver (in this case, ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.example.com");

        // Find an element on the page (e.g., the page title)
        WebElement pageTitleElement = driver.findElement(By.tagName("title"));

        // Get the text of the page title
        String pageTitle = pageTitleElement.getAttribute("text");

        // Perform a test by checking the page title
        if (pageTitle.equals("Example Domain")) {
            System.out.println("Test passed: Page title is 'Example Domain'");
        } else {
            System.out.println("Test failed: Page title is not 'Example Domain'");
        }

        // Close the browser
        driver.quit();
    }
}
