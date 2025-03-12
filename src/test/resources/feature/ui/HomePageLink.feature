@linkCheck
Feature: Home page link functionality

  Background:
    Given user is on the home page

  @wip
  Scenario: User should be able to click each link
    When The user click the "A/B Testing"
    Then The user should be able to see "abtest" in the url


  @wip
  Scenario: User should be able to click each link
    When  The user click the "Add/Remove Elements"
    Then  The user should be able to see "add_remove_elements" in the url
