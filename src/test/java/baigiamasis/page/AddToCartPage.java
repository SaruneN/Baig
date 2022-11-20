package baigiamasis.page;

public class AddToCartPage {
    public static void clickCheckBoxManufacturer() {
        Common.clickElement(Locators.AddToCart.checkBoxManufactorer);
    }

    public static void clickOnProduct() {
        Common.clickElement(
                Locators.AddToCart.product
        );
    }

    public static void clickButtonIKrepseli() {
        Common.clickElement(
                Locators.AddToCart.buttonAddToCart
        );
    }

    public static String readMessageAddToCart() {
        return Common.getTextFromElement(
                Locators.AddToCart.messageAddToCart
        );
    }
}
