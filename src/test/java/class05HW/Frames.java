package class05HW;

/*
goto https://chercher.tech/practice/frames

        click on check box
        then select baby cat from drop down
        then enter text in text box

*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://chercher.tech/practice/frames";
        openBrowserAndNavigateToURL(url,"chrome");

        //click on check box
        driver.switchTo().frame(0);
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        //select baby cat from drop down
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        //then enter text in text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Selenium is fun");










    }
}
