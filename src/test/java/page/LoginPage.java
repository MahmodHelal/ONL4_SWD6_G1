package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    String expectedTitle = "Login Page";
    By actualTitle =  By.tagName("h2");
    By usernameTextBoxBy = By.id("username");
    By passwordTextBoxBy = By.id("password");
    By loginButtonBy = By.className("radius");
    String expectedErrorForUsername = "Your username is invalid!";
    String expectedErrorForPassword = "Your password is invalid!";
    By actualErrorMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getActualTitle() {
    return driver.findElement(actualTitle).getText();

    }
    public String getActualErrorMessage() {
        return driver.findElement(actualErrorMessage).getText();
    }
    public void setUsername(String username){
        driver.findElement(usernameTextBoxBy).sendKeys(username);
    }


    public void setPassword(String password){
        driver.findElement(passwordTextBoxBy).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButtonBy).click();
        return new SecureAreaPage(driver);
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }



    public String getExpectedErrorForUsername() {
        return expectedErrorForUsername;
    }

    public String getExpectedErrorForPassword() {
        return expectedErrorForPassword;
    }


}
