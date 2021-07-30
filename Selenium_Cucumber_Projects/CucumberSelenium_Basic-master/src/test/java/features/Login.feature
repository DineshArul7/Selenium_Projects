Feature: Application Login

  Scenario: Home Page Default Login
    Given User is on Landing Page
    When User login into application with username "Dinesh" and password "Deekay@40"
    Then Home page is Displayed
    And Dashboard is Displayed
