package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndNavigateToURL(String url, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }


        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropdown(By dropdownLocator, String optionText) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(optionText);
    }

    public static void selectFromDropdown(String optionValue, By dropdownLocator) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(optionValue);
    }

    public static void selectFromDropdown(By dropdownLocator, int optionIndex) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select sel = new Select(dropdown);
        sel.selectByIndex(optionIndex);
    }



  /*  public static void selectFromDropdown(WebElement dropdown, String optionValue) {
        Select sel = new Select(dropdown);
        sel.selectByValue(optionValue);
    }
*/

}
