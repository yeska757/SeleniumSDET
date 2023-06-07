package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dinamicTables extends CommonMethods {
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
        //click o PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        //print the row that has id 56247A

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("56258A")) {
                System.out.println("the id is on the row number " + (i + 1));
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]"));
                System.out.println(row.getText());
            }
        }


    }
}
