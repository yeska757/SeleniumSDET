package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        openBrowserAndNavigateToURL(url, "chrome");

        //go in iframe
        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        //Actions class
        Actions action = new Actions(driver);
        //perform the action
        action.dragAndDrop(draggable,droppable).perform();
        //action.scrollToElement(WebElement);







    }
}
