package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class ChooseOfGiftCardTest extends TestBase {
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
    @DataProvider(name = "Choose gift card")
    public Object[][] dataProviderSamples() {
        return new Object[][]{
                {"Nemokama atvirutė","Ypatinga dovana TAU | Bijūno žiedas", 0},
                {"Nemokama atvirutė","Ypatinga dovana TAU | Lūpdažiai", 1},
                {"Nemokama atvirutė","Ypatinga dovana TAU | Vyrams", 2},
                {"Nemokama atvirutė","Ypatinga dovana TAU | Burbulai", 3},
                {"Nemokama atvirutė","Ypatinga dovana TAU | Žiedas", 4},
        };
    }
    @Test(dataProvider = "Choose gift card")
    public void testChooseTheWrapping_UseRedColorPaper( String expectedResultOfGiftCard,String expectedResultOfGiftCardType, Integer giftCardNumber) {

        String giftCardText = "Sveikinu baigus automatinio testavimo kursus";
        String actualResultOfGiftCardAdded;
        String actualResultOfGiftCardType;


        CartPage.clickOnSelectGiftCardButton();
        GiftCardPage.waitTillGiftPageWillBeShown();
        GiftCardPage.chooseGiftCardStyle(giftCardNumber);
        GiftCardPage.putGiftCardText(giftCardText);
        GiftCardPage.clickOnSubmitButton();
        actualResultOfGiftCardAdded = CartPage.readInfoThatGiftCardAddedToCart();
        actualResultOfGiftCardType = CartPage.readInfoThatRightCardTypeAddedToCard();

        Assert.assertTrue(actualResultOfGiftCardAdded.contains(expectedResultOfGiftCard) &&
                actualResultOfGiftCardType.contains(expectedResultOfGiftCardType));
    }
}
