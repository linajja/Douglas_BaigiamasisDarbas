package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class CheckOutPage {
    public static void clickRadioButtonDPD() {
        Common.clickOnElement(Locators.Douglas.Checkout.radioButtonDPD);
    }
    public static void clickRadioButtonPayInAdvance() {
        Common.clickOnElement(Locators.Douglas.Checkout.radioButtonPaymentInAdvance);
    }

    public static String readInfoOfPayInAdvance() {
        Common.waitForElement(Locators.Douglas.Checkout.paragraphPaymentInAdvanceMessage);
        return Common.getTextFromElement(Locators.Douglas.Checkout.paragraphPaymentInAdvanceMessage);
    }

    public static void clickCheckBoxAgreeWithRules() {
        Common.clickOnElement(Locators.Douglas.Checkout.labelAgreeWithRules);
    }

    public static void clickOnButtonOrder() {
        Common.clickOnElement(Locators.Douglas.Checkout.buttonOrder);
    }

}
