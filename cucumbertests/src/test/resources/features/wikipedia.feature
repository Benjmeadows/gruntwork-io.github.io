#Author: Ben_Meadows@mgic.com
@Geb
Feature: Wikipedia Example Feature
  I want to use this feature to show you how to use Geb and Cucumber to create easy to read automated UI tests

  Scenario: Simple Wikipedia navigation
    Given I am on the "Wikipedia" splash page
    And I verify the sub-header text
    When I enter the 'MGIC' into the search text
    And Click the search Button
    Then I end up on the MGIC Wikipedia entry
    
    