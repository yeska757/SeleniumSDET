package review03;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {

        String url = "https://the-internet.herokuapp.com/key_presses";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement textBox = driver.findElement(By.xpath("//input[@id='target']"));
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        textBox = driver.findElement(By.xpath("//input[@id='target']"));
        textBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        textBox = driver.findElement(By.xpath("//input[@id='target']"));
        textBox.sendKeys(Keys.ARROW_DOWN);

        takeScreenShot("abc");

    }
}
