package baigiamasis.page;

public class SearchBarPage {
    public static void clickOnSearchBar() {
        Common.clickElement(
                Locators.SearchBar.searchBar
        );
    }

    public static void enterItemName(String name) {
        Common.sendKeysToElement(
                Locators.SearchBar.searchBar, name
        );
    }

    public static void clickButtonSearch() {
        Common.clickElement(
                Locators.SearchBar.buttonSearch
        );
    }

    public static String readMessageOfSearchResult() {
        return Common.getTextFromElement(
                Locators.SearchBar.messageOfSearchResult
        );
    }
}
