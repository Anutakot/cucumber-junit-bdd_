package com.google.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils {

    //static wait

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }


    //I will get the element as a parameter and I will hover over it

    public static void hoverElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //I will get the title as a parameter and I will verify the title

    public static void verifyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    //I will get the title from the user as a param and I will check
    // my webpage contains this title

    public static void verifyTitleContains(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        if (actualTitle != null)
            Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    //we will try to wait until element is visible and I will get the element as a parameter
    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait webDriverWait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }


    //click method
    public static void click(WebElement webElement) {
        waitUntilElementIsVisible(webElement);
        webElement.click();
    }

    public static void verifyUrlContains(String partOfUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(partOfUrl));
    }


}
