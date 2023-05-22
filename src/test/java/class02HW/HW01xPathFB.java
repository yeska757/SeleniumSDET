package class02HW;

/*
HW  (only use XPATH)
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        close the popup
        close the browser
        Note : in order for ur code to work
        u have to put Thread.sleep(2000) after clicking on Create new account
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01xPathFB {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        //    navigate to fb.com
        driver.get("https://www.facebook.com/");
        //        click on create a new account
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        //        fill up all the textboxes
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yeska");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Beastmode");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yeska757@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("yeska757@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pass123!");
        //        close the popup
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        //        wait 2sec to see the popup close
        Thread.sleep(2000);
        //      close the browser
        driver.quit();

















    }
}
