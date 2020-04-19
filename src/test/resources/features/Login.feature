Feature: Login

  As user, I want to be able to login with username and password.

  #Agile story
  # Test Method = Test Case = Scenario
  # Test + DataProvider = Scenario Outline + Examples table

  Background:
    Given user is on the logging page


  Scenario: Login as sales manager and verify that title is Dashboard
    When user logs is as a sales manage
    Then user should verify that title is a Dashboard



  Scenario: Login as store manager and verify that title is Dashboard
    When user logs is as a store manage
    Then user should verify that title is a Dashboard


    @login_with_params
  Scenario: Login with parameters
    When user enters "storemanager85" username and "UserUser123" password
    Then user should verify that title is a Dashboard

