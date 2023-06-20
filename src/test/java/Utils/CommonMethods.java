package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
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

    //take screenshot
    public static void takeScreenShot(String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File screenShot = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir") + "/screenshot/" + fileName + ".png"));
        } catch (IOException e) {
            System.out.println("Screenshot wasn't taken due to error");
        }
    }


}
