package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOne {
    WebDriver driver;
    By startButtonBy = By.tagName("button");
    String expectedResultText = "Hello World!";
    By actualResultTextBy = By.cssSelector("#finish>h4");
    WebDriverWait wait;
    public ExampleOne(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }


    public void clickStartButton(){
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(startButtonBy))).click();

    }

    public String getActualResultText(){
        return  wait.until(ExpectedConditions.visibilityOf(driver.findElement(actualResultTextBy))).getText();
    }

    public String getExpectedResultText() {
        return expectedResultText;
    }
}
