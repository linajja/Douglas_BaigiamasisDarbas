package pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pom.pages.Common;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
            takeScreenshot();
        }


    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);


        String dir = "./screenshots/";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_SSS");
        String date = LocalDateTime.now().format(formatter);
        String fileName = "screenshot_" + date + ".png";

        File copyToFile = new File("%s%s".formatted(dir, fileName));
        try {
            FileUtils.copyFile(screenshotFile, copyToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}