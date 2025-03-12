package com.google.utilities;

import org.openqa.selenium.WebDriver;

public class TestDriver {

    public static void main(String[] args) {
        WebDriver webdriver = Driver.getDriver();
        webdriver.get("https://www.google.com/");
    }
}
