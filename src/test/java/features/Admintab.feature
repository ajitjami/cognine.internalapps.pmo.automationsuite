Feature: Admin tab functionality
Scenario: Add employee
When add the employee
And check the employee record is created
Scenario: Add User
When user enter login credetails
And click on login button and check user navigated to home page
When add the user with all the required details
Then check the toast message is displayed after successfully adding the user
Scenario: Search user
When enter the user name
Then verify if the user is available in the list