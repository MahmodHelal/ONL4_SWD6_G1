package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import page.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected HomPage homePage;
    protected LoginPage loginPage;
    protected CheckboxPage checkboxPage;
    protected DropdownPage dropdownPage;
    protected DynamicLoading dynamicLoading;

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToHomePage(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // -> findElement // Implicit Wait
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomPage(driver);
  }

}
