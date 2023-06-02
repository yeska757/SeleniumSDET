package class06HW;

/*
HW 2 : goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
        click on get new user
        print the firstname of user
*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        openBrowserAndNavigateToURL(url, "chrome");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUserBtn.click();
        WebElement userFirstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String firstName = userFirstName.getText();
        System.out.println(firstName);
        driver.quit();


    }
}
