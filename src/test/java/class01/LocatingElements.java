package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //facebook.com
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();

        //send some name to email
        driver.findElement(By.id("email")).sendKeys("gendosik2@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("iLoveJava");

        //print url on console
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //print the title
        String title = driver.getTitle();
        if (title.equals("Facebook - log in or sign up")) {
            System.out.println("the title is correct");
        } else {
            System.out.println("the title is incorrect");
        }
        System.out.println(title);

        //close
        driver.quit();


    }
}
