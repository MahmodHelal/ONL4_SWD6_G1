package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Initialize the driver -> open browser
        WebDriver driver = new FirefoxDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open the application -> navigate to swag labs
        driver.get("https://www.saucedemo.com/");


        WebElement UsernameTextBox = driver.findElement(By.id("user-name"));

        UsernameTextBox.sendKeys("standard_user");

        WebElement passwordTextBox =driver.findElement(By.name("password"));

        passwordTextBox.sendKeys("secret_sauce");


        WebElement LoginButton = driver.findElement(By.className("submit-button"));

        LoginButton.click();




    }
}