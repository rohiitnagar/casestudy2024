Feature: Verify the working of todo list 

#Author: Rohit Nagar

Scenario: Going to the URL 

Given Open the URL 
Then Click todo List
When addItem <item>
Then clickEnter Button
When addItem <item1>
Then clickEnter Button
Then verify
Then click deleteOne Button
Then click deleteTwo Button
Then verify


