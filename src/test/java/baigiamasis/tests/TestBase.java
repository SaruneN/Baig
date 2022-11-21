package baigiamasis.tests;

import baigiamasis.page.HomePage;
import baigiamasis.page.LoginPage;
import baigiamasis.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickIrankiaiFromMenu();
    }

    @AfterMethod
    public void tearDown() {
        LoginPage.close();
    }
}