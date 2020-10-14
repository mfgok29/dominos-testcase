
Feature: Domimos Vaka Calismasi
  @login
  Scenario: Ordering pizza home
    Given the user is on the login page
    And choosing the type of service
    And choosing the district and navigate to BasePage
    When navigates to Campaigns Page
    And choose to campaign
    And add to Basket
    And go to Basket
    And approve the Basket
    And complete Address
    Then choosing the payment



