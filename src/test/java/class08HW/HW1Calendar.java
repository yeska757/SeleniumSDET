package class08HW;

/*
hw:
        goto syntax hrms
        login
        click on recruitment
        select a date on the calanader
*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW1Calendar extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndNavigateToURL(url, "chrome");
        //log in
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //click on recruitment
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();
        WebElement calendarFromBtn = driver.findElement(By.xpath("//input[@name='candidateSearch[dateApplication][from]']"));
        calendarFromBtn.click();
        selectFromDropdown(By.xpath("//select[@class='ui-datepicker-month']"), "Aug");
        selectFromDropdown(By.xpath("//select[@class='ui-datepicker-year']"), "1993");
        //get days from the calendar and select
        boolean dayFound = false;
        while (!dayFound) {
            List<WebElement> calendar = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
            for (WebElement days : calendar) {
                String day = days.getText();
                if (day.equals("21")) {
                    days.click();
                }
            }
            dayFound = true;
        }
    }


}

