Feature: Validate Admin - Change Password

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Change Password"

Scenario: Text Fields verification
And user is to click the Old password textbox
And user is to click the New password textbox
And user is to click the Re-enter new password textbox

Scenario: Submit button verification without entering any fields
And user is to clear the Old password textbox
And user is to clear the New password textbox
And user is to clear the Re-enter new password textbox
And user is to click the submit button

Scenario: Submit button verification with entering any 2 fields
And user is to enter the value in Old password textbox
And user is to enter the value in New password textbox
And user is to click the submit button

Scenario: Submit button verification with invalid old password and valid new password
And user is to enter the invalid value in Old password textbox
And user is to enter the valid value in New password textbox
And user is to enter the valid value in Re-enter new password textbox
And user is to click the submit button

Scenario: Eye icon verification
And user is to enter the value in Old password textbox
And user is to enter the value in New password textbox
And user is to click the eye icon of Old password textbox
And user is to click the eye icon of New password textbox

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Change Password
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Change Password
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