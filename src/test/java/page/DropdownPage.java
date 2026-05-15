package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;

    By dropdownBy = By.cssSelector("#dropdown");
    By firstOptionBy = By.xpath("//option[text()=\"Option 1\"]");
    By secondOptionBy = By.xpath("//option[text()=\"Option 2\"]");


    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOptionByVisibleText(String option) {
        Select select = new Select(driver.findElement(dropdownBy));
        select.selectByVisibleText(option);

    }

    public void selectOptionByValue(String value) {
        Select select = new Select(driver.findElement(dropdownBy));
        select.selectByValue(value);
    }


    public boolean isOptionOneSelected(){
        return driver.findElement(firstOptionBy).isSelected();
    }

    public boolean isOptionTwoSelected(){
        return driver.findElement(secondOptionBy).isSelected();
    }
}
