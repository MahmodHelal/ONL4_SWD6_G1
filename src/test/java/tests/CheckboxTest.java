package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {


@Test
    public void validateDefaultState(){
    checkboxPage  = homePage.clickCheckboxes();
    Assert.assertEquals(checkboxPage.getAllChecksCount(),2);
    Assert.assertFalse(checkboxPage.isCheckboxOneSelected());
    Assert.assertTrue(checkboxPage.isCheckboxTwoSelected());
    checkboxPage.clickCheckboxOne();
    Assert.assertTrue(checkboxPage.isCheckboxOneSelected());

    }

}
