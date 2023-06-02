package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        openBrowserAndNavigateToURL(url, "chrome");
//declare wait in the beginning(will wait for all the elements)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createAcctBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcctBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        //firstName.sendKeys("abracadabra");
        sendText("abracadabra", firstName);

    }
}
