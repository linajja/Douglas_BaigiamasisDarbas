package pom.pages.douglas;

import pom.pages.Common;
import pom.pages.Locators;

public class SamplesPage {
    public static void clickOnSelectedSample(String sampleNo) {
        Common.clickOnElement(Locators.Douglas.Samples.checkBoxChooseSample(sampleNo));
    }

    public static void clickOnSubmitButton() {
        Common.clickOnElement(Locators.Douglas.Samples.buttonSubmit);
    }
}

