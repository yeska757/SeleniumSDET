package class04HW;

/*
HW1:
        goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        select , tuesday, thursday and friday one by one
*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement selectDay = driver.findElement(By.cssSelector("select.form-control"));
        Select sel = new Select(selectDay);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        sel.selectByIndex(6);  // Friday
        Thread.sleep(2000);

        driver.quit();


    }
}
