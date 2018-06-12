Feature: Cucumber and API

As a software development engineer in test at MGIC
I would like to use Cucumber and API libraries together
So I can have greater test capability than what UFT offers us now

  Scenario: Visit a site with an API and Test
    When I ping the Hello World endpoint
    Then I get the response "hello : world"
    When I ping the base URL
    Then I get a response that has the defaultUser's info