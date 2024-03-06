Feature: login into chrous application

Scenario: Verify that user is able to login into chrous portal successfully

Given user lanuch the chrous website "https://chorusdevnew.cogninelabs.com/"
When user enters the credentials
Then user should be on dashboard page