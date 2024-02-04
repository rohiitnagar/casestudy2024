Feature: To verify login credentials

#Author: Rohit Nagar

Scenario: Login Validation

Given Opening URL
When Enter Username <"Rohit"> And Enter Password <"Rvdfdh">
Then Click Login 
Then Click Alert

Scenario Outline: Login Validation with valid and invalid data
When enter username1 "<Username>" and Password1 "<Password>"
Then Click on login
Then Clicking Alert
Examples:
|  Username  |  Password  |
|  Admin     |  hjytcthf  |
| hgvyucth   |  ghvhvjhb  |