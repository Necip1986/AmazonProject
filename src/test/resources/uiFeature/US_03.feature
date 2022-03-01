
 Feature: US_03

   Scenario: User should access the "Smart Home" department from all menu and
             see the correct list of Smart Home sub-categories
     Given go to Amazon url
      Then select All menu
       And select Smart Home department
      Then verify the sub-categories of the Smart Home department is 16
