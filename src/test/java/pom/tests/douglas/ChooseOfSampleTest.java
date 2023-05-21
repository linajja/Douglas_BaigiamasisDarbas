package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class ChooseOfSampleTest extends TestBase {
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
    @DataProvider(name = "Choose sample")
    public Object[][] dataProviderSamples() {
        return new Object[][]{
                {"Kvepalų mėginys (moteriškas)", "[2]"},
                {"Kvepalų mėginys (vyriškas)", "[3]"},
                {"Kūno odos priežiūros mėginys", "[4]"},
                {"Veido odos priežiūros mėginys", "[5]"},
                {"Makiažo priemonės mėginys", "[6]"},
                {"Plaukų priežiūros mėginys", "[7]"}
        };
    }

    @Test(dataProvider = "Choose sample")
    public void testChooseTheSample(String expectedResultOfSampleName, String sampleNo) {
        String actualResultOfSampleName;

        CartPage.clickOnSelectSampleButton();
        SamplesPage.clickOnSelectedSample(sampleNo);
        SamplesPage.clickOnSubmitButton();
        actualResultOfSampleName = CartPage.readNameOfSample();

        Assert.assertTrue(actualResultOfSampleName.contains(expectedResultOfSampleName));

    }
}

