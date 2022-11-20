package baigiamasis.tests;

import baigiamasis.page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickIrankiaiFromMenu();
        IrankiaiPage.clickAkumuliatoriniaiIrankiaiFromMenu();
    }

    @DataProvider(name = "SearchBarDataProvider")
    public Object[][] dataProviderSearchBar() {
        return new Object[][]{
                {"SOLO", "SOLO"}
        };
    }

    @Test(dataProvider = "SearchBarDataProvider")
    public void testSearchBar(String inputItemName, String expectedResult) {
        String actualResult;

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
