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
                {"edvinas.benetis@gmail.com", "douglas321"},
        };
    }

    @DataProvider(name = "LoginWithFalseInfo")
    public Object[][] dataProviderFalseEmailPassword() {
        return new Object[][]{
                {"linabenetiene@gmail.com", "nezinau123"},
                {"edvinas.benetis@gmail.com", "nezinau123"},
        };
    }

    @Test(dataProvider = "LoginWithTrueInfo")
    public void testLoginToAccountWithTrueInfo(String messageEmail, String messagePassword) {
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

    @Test(dataProvider = "LoginWithFalseInfo")
    public void testLoginToAccountWithFalseInfo(String messageEmail, String messagePassword) {

        String actualResult;
        String expectedResult = "lina.benetiene@gmail.com" + "nezinau123";

        HomePage.clickOnLoginToAccount();
        LoginPage.waitTillLoginPageWillBeShown();
        LoginPage.enterEmail(messageEmail);
        LoginPage.enterPassword(messagePassword);

        actualResult = LoginPage.readEmail() + LoginPage.readPassword();

        Assert.assertEquals(actualResult, expectedResult);
    }

}