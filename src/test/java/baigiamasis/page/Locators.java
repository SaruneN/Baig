package baigiamasis.page;

import org.openqa.selenium.By;

public class Locators {

    public static class AkumuliatoriniaiIrankiai {
        public static By MenuAkumuliatoriniaiSuktuvai =
                By.xpath("//div[@class='category-thumb transition']//*[text()='Akumuliatoriniai suktuvai']");
    }
    public static class Irankiai {
        public static By MenuAkumuliatoriniaiIrankiai =
                By.xpath("//div[@class='list-group']//*[text()='Akumuliatoriniai įrankiai']");
    }
    public static class Home {
        public static By MenuIrankiai = By.xpath("//*[text()='Įrankiai']");
    }

    public static class Login {
        public static By menuUserLogin = By.xpath("//span[@class='userlogin svgbottom']");
        public static By buttonLogin = By.xpath("//button[text()='Prisijungti']");
        public static By inputEmail = By.xpath("//input[@id='input-email']");
        public static By inputPassword = By.xpath("//input[@id='input-password']");
        public static By buttonSubmit = By.xpath("//input[@class='btn btn-primary']");
        public static By paragraphLoginMessage = By.xpath("//h1[text()='Mano paskyra']");
        public static By menuUser = By.xpath("//li[@id='usercont']");
        public static By buttonLogout = By.xpath("//button[@class='last']");
        public static By paragraphLogofMessage = By.xpath("//div[@id='content']");
    }


    public static class AddToCart {
        public static By checkBoxManufactorer = By.xpath("//*[text()='BOSCH ']");
        public static By product = By.xpath("//img[@title='BOSCH GO Professional suktuvas L-Boxx ']");
        public static By buttonAddToCart = By.xpath("//button[@id='button-cart']");
        public static By messageAddToCart = By.xpath("//div[@id='swal2-content']");
    }

    public static class SearchBar {
        public static By searchBar = By.xpath("//input[@name='search']");
        public static By buttonSearch = By.xpath("//button[@class='searchbtn btn btn-default btn-lg']");
        public static By messageOfSearchResult = By.xpath("//div[@class='caption']");
    }
}
