package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownTest(){
        dropdownPage = homePage.clickDropdown();


        dropdownPage.selectOptionByVisibleText("Option 1");

        Assert.assertTrue(dropdownPage.isOptionOneSelected());

        dropdownPage.selectOptionByValue("2");

        Assert.assertTrue(dropdownPage.isOptionTwoSelected());





    }


}
