package com.google.pages;

import com.google.utilities.BrowserUtils;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import org.openqa.selenium.By;

public class AutoCompletePage {

    private By submitButton = By.xpath("//input[@type='button']");


    public  void clickSubmitButton(){
        BrowserUtils.waitUntilElementIsVisible(Driver.getDriver().findElement(submitButton));
        Driver.getDriver().findElement(submitButton).click();
        Driver.getDriver().findElement(submitButton).click();
    }

    public void visit(){
        Driver.getDriver().navigate().to(ConfigurationReader.getValue("url")+"/autocomplete");
    }
}
