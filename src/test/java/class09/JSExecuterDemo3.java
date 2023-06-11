package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecuterDemo3 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement logInBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        //JSExecuter
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",logInBtn);

    }
}
