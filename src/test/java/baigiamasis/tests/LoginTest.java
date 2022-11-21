package baigiamasis.tests;

import baigiamasis.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @DataProvider(name= "LoginDataProvider")
    public  Object[][] dataProviderLogin(){
        return new Object[][]{
                {"testas.vcs@gmail.com", "VCSTestas", "PASKYRA"}
        };
    }

    @Test(dataProvider = "LoginDataProvider")
    public void testLogin (String email, String password, String expectedResult){
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

    @DataProvider(name= "LogoutDataProvider")
    public  Object[][] dataProviderLogout(){
        return new Object[][]{
                {"testas.vcs@gmail.com", "VCSTestas", "ATSIJUNGIMAS"}
        };
    }

    @Test(dataProvider = "LogoutDataProvider")
    public void testLogout (String email, String password, String expectedResult){
        String actualResult;

        LoginPage.moveToButtonUserLoginByAction();
        LoginPage.clickButtonLoginByAction();
        LoginPage.enterElPastas(email);
        LoginPage.enterSlaptazodis(password);
        LoginPage.clickButtonPrisijungti();
        LoginPage.moveToButtonUserByAction();
        LoginPage.clickButtonAtsijungtiByAction();
        actualResult = LoginPage.readMessageOfLogout();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @DataProvider(name= "ChangeNameInPersonalInformationDataProvider")
    public  Object[][] dataProviderChangeNameInPersonalInformation(){
        return new Object[][]{
                {"testas.vcs@gmail.com", "VCSTestas", "Testas", "sėkmingai"}
        };
    }

    @Test(dataProvider = "ChangeNameInPersonalInformationDataProvider")
    public void testChangeNameInPersonalInformation(
            String email, String password, String inputText, String expectedResult ){
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
