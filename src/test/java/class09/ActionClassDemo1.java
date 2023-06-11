package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://amazon.com/";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        //Actions class
        Actions action = new Actions(driver);
        //perform the action
        action.moveToElement(signIn);






    }
}
