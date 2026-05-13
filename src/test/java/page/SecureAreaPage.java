package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    String expectedTitle = "Secure Area";
    By actualTitleBy = By.tagName("h2");
    String expectedMessage = "You logged into the secure area!";
    By actualMessageBy = By.id("flash");
    By logoutBy = By.className("icon-2x");


    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }

    public String getExpectedMessage() {
        return expectedMessage;
    }
    public  String getActualTitle(){
    return driver.findElement(actualTitleBy).getText();
    }

    public  String getActualMessage(){
    return driver.findElement(actualMessageBy).getText();
    }

    public  LoginPage clickLogout(){
    driver.findElement(logoutBy).click();
    return new LoginPage(driver);
    }


}
