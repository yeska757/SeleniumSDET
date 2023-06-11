package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecuterDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        openBrowserAndNavigateToURL(url, "chrome");

        //scroll operation

        //JSExecuter
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down
        js.executeScript("window.scrollBy(0, 500)"); //4200 how many pixels
        //sleep
        //  Thread.sleep(3000);
        //scroll up
        js.executeScript("window.scrollBy(0, -500)"); //4200 how many pixels

        WebElement allDrDown = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
        js.executeScript("aarguments[0]. click();", allDrDown);


    }
}
