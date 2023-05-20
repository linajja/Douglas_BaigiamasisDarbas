package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.douglas.*;
import pom.tests.TestBase;

public class LoginToAccountTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnCookiesAgreementButton();
    }

    @Test
    public void testLoginToAccount_LinaBenetiene() {
        String messageEmail = "lina.benetiene@gmail.com";
        String messagePassword = "nezinau123";
        String actualResult;
        String expectedResult = "logged_in";

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(messageEmail);
        LoginPage.enterPassword(messagePassword);
        LoginPage.clickOnButtonSubmit();
        actualResult = HomePage.checkIfLoginImageIsDisplayed("class");

        Assert.assertEquals(actualResult, expectedResult);
    }

}