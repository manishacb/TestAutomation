Feature: Search or Landing Page
  As a user I should able to login into my app
#
#  Background: User has logged in to Genie
#    Given I navigate to "http://localhost:3000/"
#    And I enter "100505556232" into input field having id "username"
#    And I enter "SecretPassword!" into input field having id "password"
##    Then I should get logged-in

  Scenario: Search with MDM ID
    Then I enter "100505556232" into input field having class "LHM9avbzATLtUgKVjD-aF"
#    When I click on element having id "search"
#    Then I get Search result in tabular format with all details