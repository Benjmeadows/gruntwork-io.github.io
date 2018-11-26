@browser
Feature: Cucumber and Geb
  
  As a software development engineer in test at MGIC
  I would like to use Cucumber and Geb together
  So I can have greater test capability than what UFT offers us now

  Scenario: Visit Cross Browser Automation page from the Home page
    Given I am on the "Grunt Home" page
    Then My branded icon should have the "Guntwork.io" text
    When I click on the "How It Works" button
    Then I am taken to the "How It Works" page
