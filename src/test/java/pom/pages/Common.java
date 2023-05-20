package pom.pages;

import pom.utils.Driver;

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
}

