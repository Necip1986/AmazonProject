
  Feature: Trello_testi

    @api
    Scenario: Create_Board
      Given send post request for create "yeni" board
      Then assert status code 200
      And assert board name is "yeni"