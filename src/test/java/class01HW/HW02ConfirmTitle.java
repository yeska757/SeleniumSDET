package class01HW;

/*
HW2:
        navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
        enter the username "Tester"
        enter the password "test"
        get the title of the webPage and
         confirm that it is  "Web Orders Login"
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02ConfirmTitle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //navigate to
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //get the title
        String title = driver.getTitle();
        //confirm if title is
        if (title.equals("Web Orders Login")) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title does not match, the actual title is : " + title);
        }

    }
}
