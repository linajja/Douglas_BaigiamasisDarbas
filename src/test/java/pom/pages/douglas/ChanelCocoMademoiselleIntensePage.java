package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class ChanelCocoMademoiselleIntensePage {

    public static void clickOnButtonAddToCart() {
        Common.clickOnElement(Locators.Douglas.ChanelCocoMademoiselleIntense.buttonAddToCart);
    }

    public static void clickOnCartIcon() {
        Common.sleep(1000);
        Common.clickOnElement(Locators.Douglas.ChanelCocoMademoiselleIntense.iconOfCart);
    }

    public static void clickOnRadioButton50ml() {
        Common.clickOnElement(Locators.Douglas.ChanelCocoMademoiselleIntense.radioInputChoose50mlSize);
    }
}
