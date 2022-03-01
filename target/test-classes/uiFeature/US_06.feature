
  Feature: US_06

    Background:
      Given go to Amazon url
      #Then navigate to sign in page
      #Then enter valid email address to the email box
      #Then click continue button
      #Then enter valid password to the password box
      #Then click sign in button
      Then enter "lenovo" into search box
      Then click the search button

    @TC_06
    Scenario: User should be able to see that total price of the products added to basket is correct.
    Then select first three products and add them to basket
    Then navigate to basket page
    Then verify the subtotal is correct
