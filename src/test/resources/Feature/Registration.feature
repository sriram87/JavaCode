Feature: Registration Feature
 
 Background: 
      Given User login in url
           
 @Sanity
  Scenario Outline: Validating the Account Feature
    When User Click on sign in link.
    Then User entered the email as "<email>" in Create and account section.
    And User click on Create an Account button.
    Examples:
	     |email |  |ss56@gmail.com|
  
 @Regression
  Scenario Outline: Validating the Account Feature 
    When User click on gender title.
		Then User enter the firstname as "<fname>".
		And User enter the lastname as "<lname>".
		And User enter the email as "<email>".
		And User enter the password as "<password>".
		And User enter the address as "<address>".
		And User enter the city as "<city>".
		And User select the state as "<state>".
		And User enter the pincode as "<pincode>".
		And User select the country as "<country>".
		And User enter the phoneno as "<phone>".
		And User enter the address as "<alias>".
		And User click on submit button
		
		Examples:
		|email |  |ss56@gmail.com|
		|fname |  |ss            |
		|lname |  |aa            |
		|email |  |ss56@gmail.com|
		|password||as123         |
		|address ||43,rajast,pal |
		|city    ||chennai       |
		|state   || TN           |
		|pincode || 600043       |
		|country || India        |
		|phone   || 984112878    |
		|alias   ||ss56@gmail.com|
