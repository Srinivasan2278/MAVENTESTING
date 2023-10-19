Feature: To Test group of data

@Testexcel
Scenario Outline: To Test Username and Password

Given Login to the page " https://www.espncricinfo.com"

When page loads
Then Enter the "<username>" and "<password>"

Examples:
|username|password|
|arun|1234|
|tom|123| 

@regTest
Scenario: Testing valid username
Then Entered <username> is correct
|Venkatesh|tom|arun|