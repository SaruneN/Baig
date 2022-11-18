package baigiamasis.page;


public class LoginPage {

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void enterElPastas(String email) {
        Common.sendKeysToElement(
                Locators.Login.inputEmail, email
        );
    }

    public static void enterSlaptazodis(String password) {
        Common.sendKeysToElement(
                Locators.Login.inputPassword, password
        );
    }

    public static void clickButtonPrisijungti() {
        Common.clickElement(
                Locators.Login.buttonSubmit
        );
    }

    public static void clickButtonUserLoginByAction() {
        Common.clickButtonLoginByAction(
                Locators.Login.menuUserLogin
        );
    }

    public static void clickButtonLogin() {
        Common.clickElement(
                Locators.Login.buttonLogin
        );
    }

    public static String readMessageOfLogin() {
        return Common.getTextFromElement(
                Locators.Login.paragraphLoginMessage
        );
    }
}
