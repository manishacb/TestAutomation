Feature: Login
  As a user I should able to login into my app

  Background: User is on Genie Page
    Given I navigate to "http://192.168.3.241:30853/"

  Scenario Outline: Login button is disabled if both credentials are not entered
    When User enters "<Username>" and "<Password>"
    When I click on element having xpath "//*[@id="kc-form-login"]/div/button"
    Then The button should be disabled
    Examples:
      | Username | Password |
      |          |          |
      | admin    |          |
      |          | test     |

#  Scenario: I login with valid credential
#    And I enter "admin" into input field having id "username"
#    And I enter "test" into input field having id "password"
#    When I click on element having id "submit"
##    Then I should get logged-in
#    And Last Login date and time is displayed with basic info
#    And Search bar contains static search parameters
#    And Has option to search by Cust ID
#    Then I should get logout
#
#  Scenario: I login with invalid credential
#    And I enter "ABCD1234" into input field having id "username"
#    And I enter "password" into input field having id "password"
#    When I click on element having id "submit"
##    Then I should get error message

#  Scenario: Close browser
##    Then I close browser