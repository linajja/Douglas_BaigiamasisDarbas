package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class OrderPage {
    public static String readMesageOfMissingInfoForNewOrderConfirmation() {
        return Common.getTextFromElement(Locators.Douglas.Checkout.messageMissingInfo);
    }
}
