package class05HW;

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
        click on the last alert
        send keys and accept it

        Note: don't worry if the text u send doesn't appear up in the textbox
*/

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        openBrowserAndNavigateToURL(url,"chrome");

        WebElement alert3Btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();

        Alert confirmationAlert3 = driver.switchTo().alert();
        confirmationAlert3.sendKeys("I like Selenium");
        confirmationAlert3.accept();














    }
}
