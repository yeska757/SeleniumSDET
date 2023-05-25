package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        openBrowserAndNavigateToURL(url, "chrome");

        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        String option = "15 - 50";

        for (WebElement age : ageGroup) {
           String value = age.getAttribute("value");
            if (value.equals(option)){
                age.click();
                break;
            }


        }


    }
}
