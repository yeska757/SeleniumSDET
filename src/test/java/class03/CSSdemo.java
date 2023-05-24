package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //   driver.manage().window().maximize();
        WebElement login = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button'"));
        login.click();

        Thread.sleep(2000);

        WebElement fName = driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("Yeska");



        WebElement closePopUp = driver.findElement(By.cssSelector("img[src$= '.png']"));


    }
}
