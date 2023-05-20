package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;


public class LoginPage {
    public static void waitTillLoginPageWillBeShown() {
        boolean isShown=Common.waitTillPageWillBeShown(Locators.Douglas.Login.inputEmail);
        System.out.println(("IsShown " + isShown));
    }
    public static void enterEmail(String email) {
        Common.sendKeysToElement(
                Locators.Douglas.Login.inputEmail,
                email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locators.Douglas.Login.inputPassword,
                password
        );
    }
    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locators.Douglas.Login.buttonSubmit);
    }
}