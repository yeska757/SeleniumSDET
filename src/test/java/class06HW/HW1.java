package class06HW;

/*
HW1:
        goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
        click on start
        print the text  "welcome syntax technologies "on console
*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";

        openBrowserAndNavigateToURL(url, "chrome");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"), "Welcome Syntax Technologies"));

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String welcomeText = text.getText();
        System.out.println(welcomeText);

        driver.quit();


    }
}
