Feature: To check the Login Function

Scenario Outline: Validating Login Page

Given Open the Login Page "https://demowebshop.tricentis.com/login".
When User Enter the <Name> and <PWD>
And click Login Btn
Then Validate with Login Successfull.

@ValidCredentials
Examples: 
	|Name|PWD|
	|bldeece.mrm@gamil.com|max1234|

@InvalidCredentials
Examples:
	|Name|PWD|
	|max1234@gmail.com|Max1234|