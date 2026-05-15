package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ExampleOne;
import page.ExampleTwo;

public class DynamicLoadingTest extends BaseTest {
    ExampleOne exampleOne;
    ExampleTwo exampleTwo;

    @Test
    public void validateExampleOne(){
        dynamicLoading=homePage.clickDynamicLoading();
        exampleOne=dynamicLoading.clickExampleOne();

        exampleOne.clickStartButton();


        Assert.assertEquals(exampleOne.getActualResultText(),exampleOne.getExpectedResultText());
        System.out.println("After Asser Example One");
    }


    @Test
    public  void validateExampleTwo(){
        dynamicLoading= homePage.clickDynamicLoading();
        exampleTwo=dynamicLoading.clickExampleTwo();

        exampleTwo.clickStartButton();

        Assert.assertEquals(exampleTwo.getActualResultText(),exampleTwo.getExpectedResultText());
        System.out.println("After Assert Example Two");
    }
}
