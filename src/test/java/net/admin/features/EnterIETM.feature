Feature: Validate Admin - Enter IETM

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Enter IETM"
And user is to click the Centrifugal Pumps module

Scenario: Contents verification
And user is to click the Installation content
And user is to click the Maintenance content
And user is to click the Technical Data content
And user is to click the Assembly content
And user is to click the Structural Diagram & Parts List content
And user is to click the Operation content
And user is to click the Safety content

Scenario: Search TextBox verification
And user is to click the Search Textbox
And user is to clear the Search Textbox
And user is to enter the Search Textbox
And user is to verify the related text

Scenario: Feedback to Administrator and Notes action verification
And user is to click the Feedback to Administrator action
And user is to close the Feedback to Administrator action
And user is to click the Notes action
And user is to close the Notes action

Scenario: Next and Previous buttons verification
And user is to click the Next button
And user is to click the Previous button

Scenario: Zoom dropdown action verification
And user is to click the Zoom dropdown action
And user is to click the Increase 
And user is to click the Decrease
And user is to click the Slider
And user is to click the Reset

Scenario: All actions verification
And user is to click the FullScreen action
And user is to click the Escape key in keyboard
And user is to click the Bookmark action
And user is to close the Bookmark action
And user is to click the Search action
And user is to click the Back navigation button
And user is to verify the Print action

Scenario: Manuals,Drawings and Glossary buttons verification
And user is to click the Manuals button
And user is to click the Drawings button
And user is to click the Glossary button 

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Enter IETM
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Enter IETM
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