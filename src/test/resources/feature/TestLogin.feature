@Login
Feature: Feature to test login functionality

  Background: User is on login page

  @LoginSuccess
  Scenario Outline: Check login is successfully with valid account
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks login button
    Then user navigate to home page with a <greeting> greeting lable

    Examples: 
      | username | password | greeting    |
      | quanho   | Abcd1234 | Hi quan ho, |

  @LoginUnsuccess
  Scenario Outline: Check login is unsuccessfully with invalid account
    Given user is on login page
    When user enters invalid <username> and <password>
    And user clicks login button
    Then An <errorMessage> will be displayed

    Examples: 
      | username | password  | errorMessage                          |
      | quanho   | abbcd1234 | Failed to authenticate: Access Denied |
