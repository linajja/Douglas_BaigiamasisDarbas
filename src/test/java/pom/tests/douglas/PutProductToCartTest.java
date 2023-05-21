package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class PutProductToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnCookiesAgreementButton();
        HomePage.clickOnBrandChoice();
        BrandPage.clickOnChanelBrand();
    }

    @Test
    public void testAddProductToCart_ChanelCocoMademoiselleIntense() {

        String expectedResultOfProductName = "CHANEL COCO MADEMOISELLE INTENSE";
        String actualResultOfProductName;

        ChanelPage.clickOnChanelCocoMademoiselleIntense();
        ChanelCocoMademoiselleIntensePage.clickOnRadioButton50ml();
        ChanelCocoMademoiselleIntensePage.clickOnButtonAddToCart();
        ChanelCocoMademoiselleIntensePage.clickOnCartIcon();
        actualResultOfProductName = CartPage.readNameOfProduct();

        Assert.assertEquals(actualResultOfProductName, expectedResultOfProductName);

    }
    @Test
    public void testAddProductToCart_50ml() {

        String expectedResultOfProductSize = "50 ml";
        String actualResultOfProductSize;

        ChanelPage.clickOnChanelCocoMademoiselleIntense();
        ChanelCocoMademoiselleIntensePage.clickOnRadioButton50ml();
        ChanelCocoMademoiselleIntensePage.clickOnButtonAddToCart();
        ChanelCocoMademoiselleIntensePage.clickOnCartIcon();
        actualResultOfProductSize = CartPage.readSizeOfProduct();

        Assert.assertEquals(actualResultOfProductSize, expectedResultOfProductSize);
    }
}
