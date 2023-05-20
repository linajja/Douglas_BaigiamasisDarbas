package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.douglas.lt/");
    }

    public static void clickOnCookiesAgreementButton() {
        if(
                Common.waitForElementToBeVisibleCustomised(Locators.Douglas.Home.buttonAgreeWithAllCookies)
        ){
            Common.clickOnElement(Locators.Douglas.Home.buttonAgreeWithAllCookies);
        }
    }
    public static void clickOnLoginToAccount() {
        Common.clickOnElement(Locators.Douglas.Home.buttonLoginToAccount);
    }
    public static String checkIfLoginImageIsDisplayed(String attribute) {
        return Common.getElementAttributeValue(
                Locators.Douglas.Home.imgLogin,
                attribute
        );
    }
    public static void clickOnBrandChoice() {
        Common.clickOnElement(Locators.Douglas.Home.buttonChoiceBrand);
    }
}
