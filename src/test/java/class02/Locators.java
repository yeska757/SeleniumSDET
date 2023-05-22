package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        driver.manage().window().maximize();

        //add text in username
        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");

        //slow down
        Thread.sleep(2000);

        //delete text in text box
        userNameTextBox.clear();

        //add text in username
        userNameTextBox.sendKeys("Admin");

        //add text to password
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();













    }
}
