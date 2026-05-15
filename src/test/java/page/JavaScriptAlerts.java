package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptAlerts {
    private WebDriver driver;
    By jsAertBy = By.xpath("//button[text()=\"Click for JS Alert\"]");
    By jsConfirmBy = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    By jsPromptBy = By.xpath("//button[text()=\"Click for JS Prompt\"]");
    String expectedTextResultForJsAlert = "You successfully clicked an alert";
    String expectedTextResultForCancel = "You clicked: Cancel";
    By actualResultBy = By.id("result");
    WebDriverWait wait;

    public JavaScriptAlerts(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickOnJsAlert(){
        wait.until(ExpectedConditions.elementToBeClickable(jsAertBy)).click();
    }
    public void clickOnJsConfirm(){
        wait.until(ExpectedConditions.elementToBeClickable(jsConfirmBy)).click();
    }
    public void clickOnJsPrompt(){
        wait.until(ExpectedConditions.elementToBeClickable(jsPromptBy)).click();
    }
    public String getTextFromAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }


    public void acceptAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }

    public void typeInPrompt(String text){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys(text);
    }


    public String getExpectedTextResultForJsAlert() {
        return expectedTextResultForJsAlert;
    }
    public String getActualResultText(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(actualResultBy)).getText();
    }
    public String getExpectedTextResultForCancel() {
        return expectedTextResultForCancel;
    }


}
