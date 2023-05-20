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
}
