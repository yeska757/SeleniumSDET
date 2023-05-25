package class04HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*hw2:
        goto facebook.com
        click on a create account
        and select your date of birth using select class
*/


public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.facebook.com/";

        openBrowserAndNavigateToURL(url, "chrome");

        //click on a create account
        WebElement createAcct = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAcct.click();

        Thread.sleep(1000);

        // select date of birth using select class
        //month
        WebElement month = driver.findElement(By.cssSelector("select#month"));
        Select mm = new Select(month);
        mm.selectByValue("8");
        //day
        WebElement days = driver.findElement(By.cssSelector("select#day"));
        Select dd = new Select(days);
        dd.selectByVisibleText("21");
        //year
        WebElement year = driver.findElement(By.cssSelector("select#year"));
        Select yy = new Select(year);
        yy.selectByVisibleText("1993");

        Thread.sleep(3000);

        driver.quit();


    }
}
