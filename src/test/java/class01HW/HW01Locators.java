package class01HW;

/*
HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        close the browser
        Note: use name or id as locators
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01Locators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //navigate to
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //maximize the window
        driver.manage().window().maximize();
        //fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Zheka");
        driver.findElement(By.name("customer.lastName")).sendKeys("Beastmode");
        driver.findElement(By.name("customer.address.street")).sendKeys("3335 N Military Hwy.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Norfolk");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23518");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("757-332-5925");
        driver.findElement(By.id("customer.ssn")).sendKeys("757-69-0420");
        driver.findElement(By.name("customer.username")).sendKeys("Yeska757");
        driver.findElement(By.id("customer.password")).sendKeys("Password757");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password757");
        //close the browser
        driver.quit();


    }
}
