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

    public static void moveToButtonUserLoginByAction() {
        Common.MoveToButtonLoginByAction(
                Locators.Login.menuUserLogin
        );
    }

    public static void clickButtonLoginByAction() {
        Common.clickElement(
                Locators.Login.buttonLogin
        );
    }

    public static String readMessageOfLogin() {
        return Common.getTextFromElement(
                Locators.Login.paragraphLoginMessage
        );
    }

    public static void moveToButtonUserByAction() {
        Common.MoveToButtonLoginByAction(
                Locators.Login.menuUser
        );
    }

    public static void clickButtonAtsijungtiByAction() {
        Common.clickElement(
                Locators.Login.buttonLogout
        );
    }

    public static String readMessageOfLogof() {
        return Common.getTextFromElement(
                Locators.Login.paragraphLogofMessage
        );
    }
}
