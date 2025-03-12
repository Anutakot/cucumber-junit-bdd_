package com.google.step_definitions;

import com.google.utilities.BrowserUtils;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void before(){
        //Driver.getDriver().get(ConfigurationReader.getValue("url"));
    }

    @After
    public void after(Scenario scenario){
        BrowserUtils.wait(3 );
        Driver.close();
    }

}
