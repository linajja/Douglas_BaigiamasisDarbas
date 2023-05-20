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
    public void testAddProductToCart_ChanelCocoMademoiselleIntense50ml() {

        String expectedResultOfProduct = "CHANEL COCO MADEMOISELLE INTENSE" + "50 ml";
        String actualResultOfProduct;


        ChanelPage.clickOnChanelCocoMademoiselleIntense();
        ChanelCocoMademoiselleIntensePage.clickOnRadioButton50ml();
        ChanelCocoMademoiselleIntensePage.clickOnButtonAddToCart();
        ChanelCocoMademoiselleIntensePage.clickOnCartIcon();
        actualResultOfProduct = CartPage.readNameOfProduct() + CartPage.readSizeOfProduct();


        Assert.assertTrue(actualResultOfProduct.contains(expectedResultOfProduct),
                String.format(
                        "Actual: %s, Expected: %s",
                        actualResultOfProduct,
                        expectedResultOfProduct
                )
        );
    }
}
