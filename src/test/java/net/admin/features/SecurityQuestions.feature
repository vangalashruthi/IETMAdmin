Feature: Validate Admin - Security Questions

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Security Questions"

Scenario: Textbox verification
And user is to verify the Question1 textbox
And user is to verify the Question2 textbox
And user is to verify the Answer1 textbox
And user is to verify the Answer2 textbox

Scenario: Textboxes enterable verification
And user is to click the Question1 textbox
And user is to click the Question2 textbox
And user is to click the Answer1 textbox
And user is to click the Answer2 textbox

Scenario: Submit button verification without entering any fields
And user is to clear the Question1 textbox
And user is to clear the Question2 textbox
And user is to clear the Answer1 textbox
And user is to clear the Answer2 textbox
And user is to click the submit button

Scenario: Submit button verification with entering 2 or 3 fields
And user is to clear the value in Question1 textbox
And user is to clear the value in Question2 textbox
And user is to clear the value in Answer1 textbox
And user is to clear the value in Answer2 textbox
And user is to enter the value in Question1 textbox
And user is to enter the value in Question2 textbox
And user is to enter the value in Answer1 textbox
And user is to click the submit button

Scenario: Submit button verification with entering all fields
And user is to clear the value in Question1 textbox
And user is to clear the value in Question2 textbox
And user is to clear the value in Answer1 textbox
And user is to clear the value in Answer2 textbox
And user is to enter the value in Question1 textbox
And user is to enter the value in Question2 textbox
And user is to enter the value in Answer1 textbox
And user is to enter the value in Answer2 textbox
And user is to click the submit button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Security Questions
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Security Questions
And user is to click the Forward navigation button

Scenario: Help dropdown button verification
And user is to click the Help dropdown button
And user is to verify About IETM in the dropdown
And user is to verify How to use IETM? in the dropdown
And user is to verify Version & Revision History in the dropdown

Scenario: Logout button verification
And user is to click the Logout button
And user is to click the Close button
And user is to click the No button 
And user is to click the Yes button