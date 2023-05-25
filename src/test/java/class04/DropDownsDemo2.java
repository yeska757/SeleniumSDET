package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        openBrowserAndNavigateToURL(url, "chrome");
        WebElement DD = driver.findElement(By.xpath("//select[@name='States']"));


        Select sel = new Select(DD);

        boolean isMult = sel.isMultiple();
        System.out.println("The drop down is multi select : " + isMult);

        sel.selectByVisibleText("California");
        sel.selectByValue("Ohio");
        sel.selectByIndex(7);

        sel.deselectByVisibleText("California");





    }
}
