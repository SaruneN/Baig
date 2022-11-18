package baigiamasis.tests;

import baigiamasis.page.HomePage;
import baigiamasis.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.technitis.lt/");
        HomePage.clickIrankiaiFromMenu();
    }

    @Test
    public void testLogin (){
        String email = "testas.vcs@gmail.com";
        String password = "VCSTestas";
        String expectedResult = "PASKYRA";
        String actualResult;


        LoginPage.moveToButtonUserLoginByAction();
        LoginPage.clickButtonLoginByAction();
        LoginPage.enterElPastas(email);
        LoginPage.enterSlaptazodis(password);
        LoginPage.clickButtonPrisijungti();
        actualResult = LoginPage.readMessageOfLogin();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void testLogout (){
        String email = "testas.vcs@gmail.com";
        String password = "VCSTestas";
        String expectedResult = "ATSIJUNGIMAS";
        String actualResult;

        LoginPage.moveToButtonUserLoginByAction();
        LoginPage.clickButtonLoginByAction();
        LoginPage.enterElPastas(email);
        LoginPage.enterSlaptazodis(password);
        LoginPage.clickButtonPrisijungti();
        LoginPage.moveToButtonUserByAction();
        LoginPage.clickButtonAtsijungtiByAction();
        actualResult = LoginPage.readMessageOfLogof();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void testChangeNameInPersonalInformation(){
        String email = "testas.vcs@gmail.com";
        String password = "VCSTestas";
        String inputText = "Testas";
        String expectedResult = "sėkmingai";
        String actualResult;

        LoginPage.moveToButtonUserLoginByAction();
        LoginPage.clickButtonLoginByAction();
        LoginPage.enterElPastas(email);
        LoginPage.enterSlaptazodis(password);
        LoginPage.clickButtonPrisijungti();
        LoginPage.clickButtonKeistiPaskyrosInformcija();
        LoginPage.clickOnVardasField();
        LoginPage.selectAllTextFromField();
        LoginPage.enterVardas(inputText);
        LoginPage.clickButtonTesti();
        actualResult = LoginPage.readMessageOfNameChanged();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
