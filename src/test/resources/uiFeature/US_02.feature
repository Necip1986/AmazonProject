
  Feature: Sign in

    Background:
      Given go to Amazon url
      Then navigate to sign in page


    @ParallelTest02
    @TC_02
    Scenario: User should be able to sign in with valid credentials
      Then enter valid email address to the email box
      Then click continue button
      Then enter valid password to the password box
      Then click sign in button
      Then verify sign in is successful


    @ParallelTests01
    @TC_03
    Scenario: User should not be able to sign in with invalid credentials
      Then enter invalid email address to the email box
      Then click continue button
      Then enter invalid password to the password box
      Then click sign in button
      Then verify sign in is not successful