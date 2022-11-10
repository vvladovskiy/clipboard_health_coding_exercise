Feature: Amazon.in Navigation Pages Functionality

    User story: As a user, when I am on the Amazon.in Home page
    I should be able to check a second highest priced Samsung TV
    and take information about this TV.

    Background:
        Given User is on Amazon.in Home page

    @smoke
    Scenario: Page Navigation Functionality result "About this item"
        When Click on the hamburger menu in the top left corner.
        And Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.
        Then Click on Televisions under Tv, Audio & Cameras sub section.
        Then Scroll down and filter the results by Brand ‘Samsung’.
        Then Sort the Samsung results with price High to Low.
        Then Click on the second highest priced item (whatever that maybe at the time of automating).
        Then Switch the Window
        Then Assert that “About this item” section is present and log this section text to console/report.



#    @AmazonSearch
#    Scenario: Search functionality result title verification
#        When User types "apple" in the google search box and clicks enter
#        Then User sees "apple - Google Search" is in the google title
#        Then User sees "apple - Google Search" is in the google title
#


