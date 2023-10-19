Feature:Testing Home-page

Background:
Given Access the url "https://www.espncricinfo.com"

Scenario:Test Login for homepage
When page loads expand the page
Then verify the page title
And close the page
 
Scenario: Validate the alert popup 
When page loads wait for ten seconds
Then alert popup should be displayed
And  User should click on cancel 