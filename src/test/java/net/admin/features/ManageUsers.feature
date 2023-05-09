Feature: Validate Admin - Manage Users

Background: 
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "**********"
Then user is to click the button "SUBMIT"
Then user is to click the "Manage Users"

Scenario: Search TextBox verification using ID no
And user is to click the Search TextBox
And user is to clear the Search TextBox
And user is to enter the ID no in the Search TextBox
And user is to verify the Users related to ID no

Scenario: Search TextBox verification using Username
And user is to click the Search TextBox
And user is to clear the Search TextBox
And user is to enter the Username in the Search TextBox
And user is to verify the Users related to Username

Scenario: Next & Previous and Print buttons verification
And user is to click the Next button
And user is to click the Previous button
And user is to verify the Print button

Scenario: Dropdown Entries and Settings menu verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list
And user is to verify all the actions in the Settings menu

Scenario: Add User Popup box verification
And user is to click the Add User button
And user is to verify the ID No Textbox
And user is to verify the Username Textbox
And user is to verify the Password Textbox
And user is to verify the Role Dropdown menu
And user is to verify the Submit button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Manage Users
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Manage Users
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