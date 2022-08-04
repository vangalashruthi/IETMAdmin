Feature: Validate Admin - My Hotspots

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "My Hotspots"

Scenario: Search Textbox verification using Content Type
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the Content Type in the search textbox
And user is to verify the hotspots related to Content Type

Scenario: Search Textbox verification using Content Title
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the Content Title in the search textbox
And user is to verify the hotspots related to Content Title

Scenario: Next & Previous and Settings menu verification
And user is to click the Next button
And user is to click the Previous button
And user is to click the Settings menu
And user is to verify the Edit action

Scenario: Dropdown Entries and Print button verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list
And user is to verify the Print button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the My Hotspots
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the My Hotspots
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