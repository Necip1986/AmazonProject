
  Feature: US_08 Shopping

    Background:
      Given go to Amazon url
      Then navigate to sign in page
      Then enter valid email address to the email box
      And click continue button
      Then enter valid password to the password box
      And click sign in button

      @ShoppingList
    Scenario: User should be able to create a shopping list and delete it.
    Then select Create a List from Account & Lists menu
    Then click create list button
    Then enter "Grocery List" to the List name box
    And click Create List button at Your List Page
    Then verify that "Grocery List" is created
    Then select "Grocery List" from Account & Lists menu
    Then click Manage List from More menu
    Then click Delete list button
    Then verify the "Grocery List" is deleted
