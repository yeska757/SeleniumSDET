package class03HW;

/*
HW2:
        Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        Enter valid username
        Leave password field empty
        Click on a login button
        Verify error message with text “Password cannot be empty” is displayed.

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyPassword {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement login = driver.findElement(By.cssSelector("input#btnLogin"));
        login.click();
        WebElement errMsg = driver.findElement(By.cssSelector("span#spanMessage"));
        String errorMessage = errMsg.getText();
        String expectedErrorMsg = "Password cannot be empty";
        if (errorMessage.equals(expectedErrorMsg)) {
            System.out.println("Error message displayed correctly : " + errorMessage);
        } else {
            System.out.println("Error message does not match, actual message : " + errorMessage);
        }
        driver.quit();


    }
}
