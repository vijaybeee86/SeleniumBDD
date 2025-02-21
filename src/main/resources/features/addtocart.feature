Feature: To test the ATC functionality

  Background:
    Given user launch the browser successfully
    And user login to the application successfully with valid credentials

  Scenario Outline: To test adding one item to the mini cart
    When user selects the ATC button for the product <pname>
    Then verify the mini cart is updated with qty 1

    Examples:
      | pname               |
      | Sauce Labs Backpack |

