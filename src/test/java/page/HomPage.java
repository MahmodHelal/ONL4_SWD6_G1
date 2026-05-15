package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomPage {

    private WebDriver driver;

    By formAuthenticationBy= By.linkText("Form Authentication");
    By checkboxesBy = By.linkText("Checkboxes");
    By dropdownBy = By.linkText("Dropdown");
    By dynamicLodaBy = By.linkText("Dynamic Loading");
    By JavaScriptAlertsBy = By.linkText("JavaScript Alerts");

    public HomPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
         driver.findElement(formAuthenticationBy).click();
         return new LoginPage(driver);
     }

     public CheckboxPage clickCheckboxes(){
         driver.findElement(checkboxesBy).click();
         return new CheckboxPage(driver);
     }

     public DropdownPage clickDropdown(){
         driver.findElement(dropdownBy).click();
         return new DropdownPage(driver);
     }

     public DynamicLoading clickDynamicLoading(){
         driver.findElement(dynamicLodaBy).click();
         return new DynamicLoading(driver);
     }

     public JavaScriptAlerts clickJavaScriptAlerts(){
         driver.findElement(JavaScriptAlertsBy).click();
         return new JavaScriptAlerts(driver);
     }


}
