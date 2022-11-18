package baigiamasis.tests;

import baigiamasis.page.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
        LoginPage.close();
    }
}