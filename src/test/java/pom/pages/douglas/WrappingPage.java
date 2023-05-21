package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class WrappingPage {
    public static void waitTillWrappingPageWillBeShown() {
        boolean isShown = Common.waitTillPageWillBeShown(Locators.Douglas.Wrapping.checkboxChooseProductToWrap);
        System.out.println(("IsShown " + isShown));
    }

    public static void clickOnProductWhichWillBeWrapped() {
        Common.clickOnElement(Locators.Douglas.Wrapping.checkboxChooseProductToWrap);
    }

    public static void putInWrappingComment(String comment) {
        Common.sendKeysToElement(
                Locators.Douglas.Wrapping.textareaPackingComment,
                comment
        );
    }

    public static void clickOnSubmitButton() {
        Common.sleep(1000);
        Common.clickOnElement(Locators.Douglas.Wrapping.buttonSubmit);
    }
}
