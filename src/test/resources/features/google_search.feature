Feature: Amazon.in Navigation Pages Functionality
   User story: As a user, when I am on the Amazon.in Home page
   I should be able to check a second highest priced Samsung TV
   and take information about this TV.

  Background:
    Given User is on Amazon.in Home page

  @smoke
  Scenario: Search functionality result title verification
  When User types apple in the google search box and clicks enter
  Then User sees apple – Google Search is in the google title

  @googleSearch
  Scenario: Search functionality result title verification
    When User types "apple" in the google search box and clicks enter
    Then User sees "apple - Google Search" is in the google title
    Then User sees "apple - Google Search" is in the google title



