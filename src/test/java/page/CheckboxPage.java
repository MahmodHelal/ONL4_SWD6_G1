package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {
    WebDriver driver;
    By allChecksBy = By.xpath("//input[@type='checkbox']");
    By checkboxOneBy = By.cssSelector("input[type=\"checkbox\"]:nth-of-type(1)");
    By checkboxTwoBy = By.cssSelector("input[type=\"checkbox\"]:nth-of-type(2)");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }


    public int getAllChecksCount() {
        return driver.findElements(allChecksBy).size();
/*        List<WebElement> allChecks = driver.findElements(allChecksBy);
        return allChecks.size();*/

    }


    public boolean isCheckboxOneSelected() {
    return driver.findElement(checkboxOneBy).isSelected();
    }

    public boolean isCheckboxTwoSelected() {
    return driver.findElement(checkboxTwoBy).isSelected();
    }


    public void clickCheckboxOne() {
    driver.findElement(checkboxOneBy).click();
    }




}
