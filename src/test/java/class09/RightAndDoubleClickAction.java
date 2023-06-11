package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickAction extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement rClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        //Actions class
        Actions action = new Actions(driver);
        //perform the action
        action.contextClick(rClickBtn).perform();
        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        //editBtn.click();
        action.click(editBtn).perform();

        //handle alert
        Alert editAlert = driver.switchTo().alert();
        editAlert.accept();

        //double click btn
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick(doubleClickBtn).perform();




    }
}
