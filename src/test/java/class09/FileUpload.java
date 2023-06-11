package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        openBrowserAndNavigateToURL(url, "chrome");

        WebElement fileUploadBtn = driver.findElement(By.id("file-upload"));
        fileUploadBtn.sendKeys("C:\\Users\\Yeska\\Desktop\\SDET\\Selenium.png");


    }
}
