@api
Feature: Cucumber and API

As a software development engineer in test at MGIC
I would like to use Cucumber and API libraries together

  Scenario: Visit a site with an API and Test
    When I visit wikipedia's API endpoint and I search for "bee"; with a limit of 1
    Then I get the title of the article "Bee"
    When I expand my search on wikipedia's API endpoint to allow 10 results for "bee"
    Then The response contains some facts about Beer