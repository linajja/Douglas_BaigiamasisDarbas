package pom.tests.douglas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "LoginWithTrueInfo")
    public Object[][] dataProviderTrueEmailPassword() {
        return new Object[][]{
                {"lina.benetiene@gmail.com", "nezinau123"},
                {"edvinas.benetis@gmail.com", "douglas321"}
        };
    }

    @DataProvider(name = "LoginWithFalseInfo")
    public Object[][] dataProviderFalseEmailPassword() {
        return new Object[][]{
                {"linabenetiene@gmail.com", "nezinau123"},
                {"edvinas@benetis@gmail.com", "nezinau123"}
        };
    }

    @Test(dataProvider = "LoginWithTrueInfo")
    public void testLoginToAccountWithTrueInfo(String email, String password) {
        String actualResult;
        String expectedResult = "logged_in";

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonSubmit();
        actualResult = HomePage.checkIfLoginImageIsDisplayed("class");

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "LoginWithFalseInfo")
    public void testLoginToAccountWithFalseInfo(String email, String password) {

        String expectedResult="Neteisingi prisijungimo duomenys.";
        String actualResult;

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonSubmit();

        actualResult = LoginPage.readAlertMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}