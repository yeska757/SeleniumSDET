package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement r1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();

        boolean r1isSelected = r1.isSelected();
        System.out.println("the radio button Male is selected : " + r1isSelected);

        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("the radio button Male is displayed : " + r1isDisplayed);

        boolean r1isEnabled = r1.isEnabled();
        System.out.println("the radio button Male is enabled : " + r1isEnabled);

        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();

        r1isSelected = r1.isSelected();
        System.out.println("the Male radio button is selected : " + r1isSelected);


    }
}
