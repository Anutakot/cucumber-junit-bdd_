package com.google.pages;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        //                       WebDriver  ,  Object
        PageFactory.initElements( Driver.getDriver(),this);

    }

    public void visit(String endpoint){
        Driver.getDriver().navigate().to(ConfigurationReader.getValue("url")+endpoint);
    }

}
