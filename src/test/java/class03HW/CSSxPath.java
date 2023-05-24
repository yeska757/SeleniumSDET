package class03HW;

/*
HW1:
        Open Chrome browser
        Go to http://practice.syntaxtechs.net/input-form-demo.php
        fill in the complete form
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSxPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Yeska");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Beastmode");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("yeska757@gmail.com");
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("757-332-5925");
        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("3335 N Military Hwy");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Norfolk");
        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Virginia");
        WebElement zip = driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("23518");
        WebElement website = driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("www.bossautova.com");
        WebElement comment = driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("Xpath and CSS selectors");
        WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Send' )]"));
        submit.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
