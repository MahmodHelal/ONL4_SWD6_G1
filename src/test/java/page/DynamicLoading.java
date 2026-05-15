package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    WebDriver driver;
    By example1 = By.partialLinkText("Example 1:");
    By example2 = By.partialLinkText("Example 2:");


    public DynamicLoading(WebDriver driver) {
        this.driver = driver;
    }



    public ExampleOne clickExampleOne(){
        driver.findElement(example1).click();
        return new ExampleOne(driver);
    }

    public ExampleTwo clickExampleTwo(){
        driver.findElement(example2).click();
        return new ExampleTwo(driver);
    }



}
