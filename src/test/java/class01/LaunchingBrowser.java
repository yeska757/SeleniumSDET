package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance
        WebDriver driver = new ChromeDriver();
        //use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");

        //maximize the window of browser
        driver.manage().window().maximize();

        //add wait time
        Thread.sleep(5000);

        //get the current url
        String currentURL = driver.getCurrentUrl();
        //print on the console
        System.out.println("Current url of the website is: " + currentURL);

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

        //close the webbrowser
        driver.quit();


    }
}
