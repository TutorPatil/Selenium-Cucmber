Feature: Actitime loginPage

  Scenario: Valid Login scenarios for atitime
    Given I Launch the actitime application
    When I enter "admin" as username and "manager" as password
    And click on Login button    
    Then User should login and logoutlinks should be displayed
