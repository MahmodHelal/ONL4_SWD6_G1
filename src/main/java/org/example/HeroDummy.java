package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeroDummy {
    WebDriver driver;


    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
         driver = new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/");


        WebElement FormLink = driver.findElement(By.linkText("Form Authentication"));

        FormLink.click();


        String actualCurrentUrl =driver.getCurrentUrl();

        String expectedCurrentUrl = "https://the-internet.herokuapp.com/login";


        if (actualCurrentUrl.equals(expectedCurrentUrl)){
            System.out.println("Current URL: " + actualCurrentUrl);
            System.out.println("Expected URL: " + expectedCurrentUrl);
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        Thread.sleep(2000);

    }


    @Test(priority = 1)
    public void validLogin(){


        String actualTitleOfPage = driver.findElement(By.tagName("h2")).getText();

        String expectedTitleOfPage = "Login Page";

        if (actualTitleOfPage.equals(expectedTitleOfPage)){
            System.out.println("Title of the page: " + actualTitleOfPage);
            System.out.println("Expected Title of the page: " + expectedTitleOfPage);
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }


        WebElement usernameTextBox = driver.findElement(By.id("username"));

        usernameTextBox.sendKeys("tomsmith");

        WebElement passwordTextBox = driver.findElement(By.id("password"));

        passwordTextBox.sendKeys("SuperSecretPassword!");


        WebElement loginButton = driver.findElement(By.className("radius"));

        loginButton.click();

        String actualSuccessMessage = driver.findElement(By.id("flash")).getText();

        String expectedSuccessMessage = "You logged into a secure area!";

        if (actualSuccessMessage.contains(expectedSuccessMessage)){
            System.out.println("Success Message: " + actualSuccessMessage);
            System.out.println("Expected Success Message: " + expectedSuccessMessage);
            System.out.println("Test Passed");
        }else {
            System.out.println("Fail Test Success Message: " + actualSuccessMessage);
            System.out.println("Fail Test Expected Success Message: " + expectedSuccessMessage);
            System.out.println("Test Failed");
        }



    }

    @Test(priority = 2)
    public void invalidLogin(){


        driver.findElement(By.id("username")).sendKeys("wrong username");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();


        if (driver.findElement(By.id("flash")).getText().contains("Your username is invalid!")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }




    }
    
    
   
}
