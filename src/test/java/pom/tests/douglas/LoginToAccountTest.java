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
                {"linabenetiene@gmail.com", "lina@benetiene@gmail.com", "nezinau123", "nezinau123"},
                {"edvinas@benetis@gmail.com", "edvinas@benetis@gmail.com", "nezinau123", "douglas321"}
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
    public void testLoginToAccountWithFalseInfo(String email, String expectedEmail, String password,
                                                String expectedPassword) {

        String actualEmail;
        String actualPassword;

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);

        actualEmail = LoginPage.readEmail();
        actualPassword = LoginPage.readPassword();

        Assert.assertTrue(actualEmail.equals(expectedEmail) && actualPassword.equals(expectedPassword),
                String.format(
                        "ActualEmail: %s, ExpectedEmail: %s, ActualPassword: %s, ExpectedPassword: %s,",
                        actualEmail,
                        expectedEmail,
                        actualPassword,
                        expectedPassword
                )
        );
    }
}