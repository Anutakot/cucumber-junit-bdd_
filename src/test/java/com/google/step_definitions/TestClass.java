package com.google.step_definitions;

import com.google.pages.AutoCompletePage;

public class TestClass {

    public static void main(String[] args) {
       /* HomePage homePage = new HomePage();
        homePage.visit();

        ABTestingPage abTestingPage = new ABTestingPage();
        abTestingPage.visit();
        */


        AutoCompletePage autoCompletePage = new AutoCompletePage();
        autoCompletePage.visit();
        autoCompletePage.clickSubmitButton();

    }

}
