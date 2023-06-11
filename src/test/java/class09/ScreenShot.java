package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndNavigateToURL(url, "chrome");

        //press the login btn
        //    find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

        //declare instance
        TakesScreenshot ts = (TakesScreenshot) driver;
        //take screenShot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File("C:\\Users\\Yeska\\IdeaProjects\\SeleniumSDET\\screenshot\\testSyntax.png"));


    }
}
