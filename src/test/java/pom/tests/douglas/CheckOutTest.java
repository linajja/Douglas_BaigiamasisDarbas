package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class CheckOutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnCookiesAgreementButton();
    }

    @Test
    public void testCheckOut() {

        String email="lina.benetiene@gmail.com";
        String password="nezinau123";
        String actualResultOfMissingInfoForNewOrder;
        String expectedResultOfMissingInfo = "Pasirinkite pristatymo laiką.";

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonSubmit();

        HomePage.clickOnBrandChoice();
        BrandPage.clickOnChanelBrand();
        ChanelPage.clickOnChanelCocoMademoiselleIntense();
        ChanelCocoMademoiselleIntensePage.clickOnRadioButton50ml();
        ChanelCocoMademoiselleIntensePage.clickOnButtonAddToCart();
        ChanelCocoMademoiselleIntensePage.clickOnCartIcon();
        CartPage.clickOnContinueButton();

        CheckOutPage.clickRadioButtonDPD();
        CheckOutPage.clickRadioButtonPayInAdvance();
        CheckOutPage.readInfoOfPayInAdvance();
        CheckOutPage.clickCheckBoxAgreeWithRules();
        CheckOutPage.clickOnButtonOrder();
        actualResultOfMissingInfoForNewOrder = OrderPage.readMesageOfMissingInfoForNewOrderConfirmation();

        Assert.assertTrue(actualResultOfMissingInfoForNewOrder.contains(expectedResultOfMissingInfo));
    }
}

