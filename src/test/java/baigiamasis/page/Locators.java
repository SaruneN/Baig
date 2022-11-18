package baigiamasis.page;

import org.openqa.selenium.By;

public class Locators {
    public static class Home {
        public static By MenuIrankiai = By.xpath("//*[text()='Įrankiai']");
    }

    public class Login {
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
}
