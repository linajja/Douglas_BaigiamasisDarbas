package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class ChooseOfWrappingTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnCookiesAgreementButton();
        HomePage.clickOnBrandChoice();
        BrandPage.clickOnChanelBrand();
        ChanelPage.clickOnChanelCocoMademoiselleIntense();
        ChanelCocoMademoiselleIntensePage.clickOnRadioButton50ml();
        ChanelCocoMademoiselleIntensePage.clickOnButtonAddToCart();
        ChanelCocoMademoiselleIntensePage.clickOnCartIcon();
    }
    @Test
    public void testChooseTheWrapping_UseRedColorPaper() {
        String expectedResultOfWrapping = "Nemokamas dovanos pakavimas";
        String packingComment="Naudoti raudonos spalvos popierių";
        String actualResultOfWrapping;

        CartPage.clickOnSelectFreeWrappingButton();
        WrappingPage.waitTillWrappingPageWillBeShown();
        WrappingPage.clickOnProductWhichWillBeWrapped();
        WrappingPage.putInWrappingComment(packingComment);
        WrappingPage.clickOnSubmitButton();
        actualResultOfWrapping = CartPage.readInfoThatWrappingAddedToCart();

        Assert.assertTrue(actualResultOfWrapping.contains(expectedResultOfWrapping));

    }
}