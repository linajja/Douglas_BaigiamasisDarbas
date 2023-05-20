package pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Douglas {

        public static class Home {
            public static By buttonAgreeWithAllCookies = By.xpath("//a[@class='btn btn-tiartery btn-lg btn-block btn-comply act-acceptCookies']");
            public static By buttonLoginToAccount = By.xpath("//a[@class='menu_icon need2login']");
            public static By imgLogin = By.xpath("//img[@class='logged_in']");
            public static By buttonChoiceBrand = By.xpath("//a[text()='Prekių ženklai']");
        }

        public static class Login {
            public static By inputEmail = By.xpath("//input[@id='login_email_input']");
            public static By inputPassword = By.xpath("//input[@id='login_password_input']");
            public static By buttonSubmit = By.xpath("//div[@id='popup_login']//button[@type='submit']");
        }
    }
}