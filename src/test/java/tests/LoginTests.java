package tests;

import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomPage;
import page.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void validLogin(){
        loginPage = homePage.clickFormAuthentication();// loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();

    }
    @Test
    public void invalidUsernameLogin(){
        loginPage = homePage.clickFormAuthentication();// loginPage = new LoginPage(driver);
        System.out.println("Before First Assert");
        Assert.assertEquals(loginPage.getActualTitle(),loginPage.getExpectedTitle());
        System.out.println("After First Assert");

        loginPage.setUsername("wrong data");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        System.out.println("Before Second Assert");
        Assert.assertEquals(loginPage.getActualErrorMessage(),loginPage.getExpectedErrorForUsername(),"Message is not correct");
        Assert.assertTrue(loginPage.getActualErrorMessage().contains(loginPage.getExpectedErrorForUsername()));
        System.out.println("After Second Assert");

   /*     if (loginPage.getActualErrorMessage().contains(loginPage.getExpectedErrorForUsername())){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }*/


        // Testng
        // soft asser - hard assert
    }
}
