package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class GiftCardPage {
    public static void waitTillGiftPageWillBeShown() {
        boolean isShown = Common.waitTillPageWillBeShown(Locators.Douglas.GiftCard.buttonChooseCardType);
        System.out.println(("IsShown " + isShown));
    }

    public static void chooseGiftCardStyle(Integer numberOfTimes) {
        Common.clickOnElementFewTimes(numberOfTimes);
    }

    public static void putGiftCardText(String text) {
        Common.sendKeysToElement(
                Locators.Douglas.GiftCard.textareaGiftCardText,
                text
        );
    }

    public static void clickOnSubmitButton() {
        Common.sleep(2000);
        Common.clickOnElement(Locators.Douglas.GiftCard.buttonSubmit);
        Common.sleep(2000);
    }

}