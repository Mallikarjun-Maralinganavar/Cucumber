Feature: To check ragsister function 

@RegsistionValidation
Scenario: To validate Ragsister function
Given Opens the Demowebshop "https://demowebshop.tricentis.com/register"
When User Enter the register data.
And Click the register btn
Then Validating the user is registered successfully.
