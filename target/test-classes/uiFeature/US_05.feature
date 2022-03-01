
  Feature: US_05 sort and filter

    Background:
      #Given go to AmazonUK url
      Given go to Amazon url
      Then enter "Lenovo" into search box
      Then click the search button

    @TC_05
    Scenario: User should be able to sort a product price Low to High
    Then click the Sort By button
    And Select Low to High
    Then verify the product prices are listed Low to High
