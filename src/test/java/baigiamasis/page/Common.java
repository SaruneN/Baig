package baigiamasis.page;

import baigiamasis.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Common {
    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void close() {
        Driver.close();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void MoveToButtonLoginByAction(By locator) {
        WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void selectAllText(By locator) {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    }

    public static String getAttributeValue(By locator) {
        WebElement element = getElement(locator);
        return element.getAttribute("value");

    }
}
