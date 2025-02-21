Feature: To test the login functionality

  Background:
    Given user launch the browser successfully

  @valid
  Scenario Outline: Successful login to the application
      When user enters the username <username>
      And user enters the password <password>
      And user clicks the login button
      Then user login to the application successfully

      Examples:
        | username | password |
        |standard_user | secret_sauce |

  @invalid
  Scenario Outline: Unsuccessful login to the application
    When user enters the username <username>
    And user enters the password <password>
    And user clicks the login button
    Then user fail to login to the application

    Examples:
      | username         | password             |
      | standard_user | secret_sauce123 |

