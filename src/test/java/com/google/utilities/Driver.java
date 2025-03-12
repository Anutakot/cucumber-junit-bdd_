package com.google.utilities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver (){
    }

    //instance
    private static WebDriver driver;//needs to be static, you can not reach that field from static method or block

   /*private static WebDriver getChromeDriver(){
        driver = new ChromeDriver();
        return driver;
    }
    */

    private static WebDriver getFirefoxDriver(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    //this is open one browser method!
    public static WebDriver getDriver (){

        if (driver == null){
            String browserType = ConfigurationReader.getValue("browser");

            if (browserType.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            } else if (browserType.equalsIgnoreCase("firefox")) {
                return getFirefoxDriver();
            }else {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            }

        }
        return driver;
    }

    //close browser
    public static void close (){

       if (driver != null){
           driver.close();
           driver.quit();
           driver = null;
       }
    }

}
