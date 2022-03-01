
  Feature:US_09

    Background:
      Given go to Amazon url
      Then navigate to sign in page
      Then enter valid email address to the email box
      And click continue button
      Then enter valid password to the password box
      And click sign in button

      @TC_09
    Scenario: User should be able to add products to the created list and remove it
    #Then select Create a List from Account & Lists menu
    #And click create list button
    #Then enter "Grocery List" to the List name box
    #And click create list button
    Then enter "honey" into search box
    And click the search button
    Then select first product and add it to "Grocery List"
    Then verify the "first product" in "Grocery List"
    Then select "Grocery List" from Account & Lists menu
    Then click Remove button for added product
    Then verify the "first product" removed from "Grocery List"
