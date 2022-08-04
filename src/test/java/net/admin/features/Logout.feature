Feature: Validate Admin - Logout

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Logout"

Scenario: Buttons verification
And user is to verify the Yes button
And user is to verify the No button
And user is to verify the Close button

Scenario: Buttons clickable verification
And user is to click the No button
And user is to click the Logout
And user is to click the Close button
And user is to click the Logout
And user is to click the Yes button