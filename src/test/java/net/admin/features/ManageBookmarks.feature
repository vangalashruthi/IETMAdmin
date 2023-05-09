Feature: Validate Admin - Manage Bookmarks

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Manage Bookmarks"

Scenario: Search TextBox verification using name
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the name in search textbox
And user is to verify the bookmarks related to name

Scenario: Dropdown Entries verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list

Scenario: Next & Previous and Print buttons verification
And user is to click the Next button
And user is to click the Previous button
And user is to verify the Print button

Scenario: Sorting icons and Settings menu verification
And user is to click the Sorting icons
And user is to click the Settings menu
And user is to verify the Edit and Delete actions

Scenario: Name & Link verification
And user is to click the Name and Link
And user is to redirect to module page
And user is to verify the module page
And user is to click the Backward navigation button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Manage Bookmarks
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Manage Bookmarks
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
