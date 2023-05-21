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
    public static void clickOnSelectFreeWrappingButton() {
        Common.clickOnElement(Locators.Douglas.Cart.buttonAddWrapping);
    }

    public static String readInfoThatWrappingAddedToCart() {
        Common.sleep(1000);
        return Common.getTextFromElement(Locators.Douglas.Cart.spanWrapping);
    }
    public static void clickOnSelectGiftCardButton() {
        Common.clickOnElement(Locators.Douglas.Cart.buttonAddGiftCard);
    }

    public static String readInfoThatGiftCardAddedToCart() {
        return Common.getTextFromElement(Locators.Douglas.Cart.spanGiftCardAdded);
    }

    public static String readInfoThatRightCardTypeAddedToCard() {
        return Common.getTextFromElement(Locators.Douglas.Cart.spanGiftCardType);
    }
}
