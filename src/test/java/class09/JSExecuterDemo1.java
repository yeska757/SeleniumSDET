package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JSExecuterDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));

        //JSExecuter
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='teal'", userNameTxtBox);
        js.executeScript("arguments[0].style.border='5px solid blue'", userNameTxtBox);



    }
}
