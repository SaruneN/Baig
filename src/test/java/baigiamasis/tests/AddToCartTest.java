package baigiamasis.tests;

import baigiamasis.page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase{
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickIrankiaiFromMenu();
        IrankiaiPage.clickAkumuliatoriniaiIrankiaiFromMenu();
        AkumuliatoriniaiIrankiaiPage.clickAkumuliatoriniaiSuktuvaiFromMenu();
    }

    @Test
    public void testAddToCart(){
        String expectedResult = "Pavyko";
        String actualResult;

        AddToCartPage.clickCheckBoxManufacturer();
        AddToCartPage.clickOnProduct();
        AddToCartPage.clickButtonIKrepseli();
        actualResult = AddToCartPage.readMessageAddToCart();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
