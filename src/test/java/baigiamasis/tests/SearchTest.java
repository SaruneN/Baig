package baigiamasis.tests;

import baigiamasis.page.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickIrankiaiFromMenu();
        IrankiaiPage.clickAkumuliatoriniaiIrankiaiFromMenu();
        AkumuliatoriniaiIrankiaiPage.clickAkumuliatoriniaiSuktuvaiFromMenu();
    }

    @Test
    public void testSearchBar() {
        String expectedResult = "SOLO";
        String actualResult;
        String inputItemName = "SOLO";

        SearchBarPage.clickOnSearchBar();
        SearchBarPage.enterItemName(inputItemName);
        SearchBarPage.clickButtonSearch();
        actualResult = SearchBarPage.readMessageOfSearchResult();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
