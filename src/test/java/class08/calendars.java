package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class calendars extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.aa.com/homePage.do?locale=en_US";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement calendarBtn = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendarBtn.click();

        boolean monthFound = false;
        while (!monthFound) {
            WebElement currentMnth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String mnthText = currentMnth.getText();
            if (mnthText.equals("August")) {
                System.out.println("you are on the right month");
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                  String currentDate = date.getText();
                  if (currentDate.equals("21")){
                      date.click();
                  }
                }
                monthFound = true;
            } else {
                WebElement nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));
                nextBtn.click();
            }
        }


    }

}
