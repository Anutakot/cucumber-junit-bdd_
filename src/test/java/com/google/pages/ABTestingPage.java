package com.google.pages;

import com.fasterxml.jackson.databind.ser.Serializers;

public class ABTestingPage extends BasePage {

    public void visit() {
        super.visit("/abtest");
    }
}
