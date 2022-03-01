
  Feature: US_04

    @TC_04
    Scenario: User should see the each search result includes the word searched
    Given go to Amazon url
    Then enter "Lenovo" into search box
    And click the search button
    Then verify that all the products listed includes "Lenovo"

