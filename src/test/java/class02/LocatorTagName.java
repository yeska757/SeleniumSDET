package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {

        //navigate to the amazon.com
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        //maximize screen
        driver.manage().window().maximize();

        //store all links in a list
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //traverse
        for (WebElement link:allLinks){
          String linkOfWebsite = link.getAttribute("href");
            System.out.println(linkOfWebsite);
        }



    }
}
