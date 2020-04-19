
@create_car
Feature: Create a car
  As user, I want to be able to add new cars

  Scenario: Add new car
    Given user is on the login page
    When user logs is as a sales manage
    Then user navigates to "Fleet" and "Vehicles"
    And user click on create a car button
    Then user create a car with following info:
    | License Plate | Driver   | Location   | Model Year | Color |
    | SDET          | ERFAN    | PORTLAND   | 2020       | BLUE  |


