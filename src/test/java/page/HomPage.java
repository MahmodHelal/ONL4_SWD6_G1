package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomPage {

    private WebDriver driver;

    By formAuthenticationBy= By.linkText("Form Authentication");

    public HomPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
         driver.findElement(formAuthenticationBy).click();
         return new LoginPage(driver);
     }



}
