package baigiamasis.tests;

import baigiamasis.page.HomePage;
import baigiamasis.page.Locators;
import baigiamasis.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickElementsFromMenu();

    }

    @Test
    public void testLogin (){

        String email = "testas.vcs@gmail.com";
        String password = "VCSTestas";
        String expectedResult = "PASKYRA";
        String actualResult;


        LoginPage.clickButtonUserLoginByAction();
        LoginPage.clickButtonLogin();
        LoginPage.enterElPastas(email);
        LoginPage.enterSlaptazodis(password);
        LoginPage.clickButtonPrisijungti();
        actualResult = LoginPage.readMessageOfLogin();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
