package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import page.HomPage;
import page.LoginPage;

public class BaseTest {
    WebDriver driver;
    protected HomPage homePage;
    protected LoginPage loginPage;


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
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomPage(driver);

    }


}
