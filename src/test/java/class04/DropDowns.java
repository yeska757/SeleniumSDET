package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.facebook.com/";
        openBrowserAndNavigateToURL(url, "chrome");
        ///        click on create a new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel = new Select(days);
        sel.selectByVisibleText("4");
        Thread.sleep(2000);
        sel.selectByValue("20");
        Thread.sleep(2000);
        sel.selectByIndex(20);


    }
}
