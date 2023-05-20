package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static List<String> brokenLinks = new ArrayList<>();
    public static List<String> validLinks = new ArrayList<>();
    public static List<String> brokenImages = new ArrayList<>();

    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator) {
        int waitingSeconds = 10;
        for (int i = 0; i < (waitingSeconds * 2); i++) {
            try {
                getElement(locator);
                return true;
            } catch (NoSuchElementException e) {
                sleep(500);
            }
        }
        return false;
    }
    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }
    public static void sendKeysToElement(By locator, String sendKeys) {
        getElement(locator).sendKeys(sendKeys);
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static Boolean waitTillPageWillBeShown(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;
    }

    public static void clickOnElementWithActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(getElement(locator))
                .click()
                .build()
                .perform();

    }
}

