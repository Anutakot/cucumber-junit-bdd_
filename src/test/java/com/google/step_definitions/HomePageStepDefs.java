package com.google.step_definitions;

import com.google.pages.HomePage;
import com.google.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefs {

    HomePage homePage;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        homePage = new HomePage();
        homePage.visit();
    }

    @When("The user click the {string}")
    public void the_user_click_the(String linkText) {

        homePage.clickLinkByText(linkText);
    }

    @Then("The user should be able to see {string} in the url")
    public void the_user_should_be_able_to_see_in_the_url(String endpoint) {
        BrowserUtils.verifyUrlContains(endpoint);

    }




}
