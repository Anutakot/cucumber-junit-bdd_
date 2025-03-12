package com.google.pages;

import com.google.utilities.BrowserUtils;
import com.google.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//test")
    public WebElement testElement;

    public void visit() {
        super.visit("/");
    }

    public void clickLinkByText (String text){
        String locator = "//a[contains(., '" + text + "')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        BrowserUtils.click(element);

    }
}
