package review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class calendars extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {

        String url = "https://www.delta.com/";
        openBrowserAndNavigateToURL(url, "chrome");

//locate the calander
        WebElement calander = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        click on calander
        js.executeScript("arguments[0].click();", calander);
//        get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean found = false;
        while (!found) {
            String currentMonth = month.getText();
            if (currentMonth.equals("September")) {
                js.executeScript("arguments[0].style.border='5px solid pink'",month);
                found = true;

            } else {
//            next button
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }
        }

        List<WebElement> Dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for (WebElement date : Dates) {
            String text = date.getText();
            if (text.equals("21")) {
                date.click();
                break;
            }
        }


    }
}