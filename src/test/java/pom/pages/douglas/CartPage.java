package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class CartPage {
    public static String readNameOfProduct() {
        return Common.getTextFromElement(Locators.Douglas.Cart.spanProductName);
    }

    public static String readSizeOfProduct() {
        return Common.getTextFromElement(Locators.Douglas.Cart.spanProductSize);
    }
    public static void clickOnSelectSampleButton() {
        Common.sleep(1000);
        Common.clickOnElement(Locators.Douglas.Cart.buttonChooseSample);
        Common.sleep(1000);
    }

    public static String readNameOfSample() {
        return Common.getTextFromElement(Locators.Douglas.Cart.spanSampleName);
    }

}
