Feature: Validate Admin - Manage Annotations

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Manage Annotations"

Scenario: Search Textbox verification using Title name
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the title name in the search textbox
And user is to verify the Annotated text related to title name

Scenario: Search Textbox verification using Description
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the description in the search textbox
And user is to verify the Annotated text related to description

Scenario: Dropdown Entries verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list

Scenario: Next & Previous and Print buttons verification
And user is to click the Next button
And user is to click the Previous button
And user is to verify the Print button

Scenario: Filter icon button verification
And user is to click the filter icon button
And user is to click the Notes action
And user is to click the filter icon button
And user is to click the Feedback to Administrator action
And user is to click the filter icon button
And user is to click the All action

Scenario: Delete icon button and Checkboxes verification
And user is to click the delete icon button without selecting checkbox
And user is to select the checkbox
And user is to click the delete icon button
And user is to verify the Yes button of Delete Annotations 
And user is to click the No button of Delete Annotations
And user is to click the delete icon button
And user is to click the close button

Scenario: Sorting icons and Settings menu verification
And user is to click the Sorting icons
And user is to click the Settings menu
And user is to verify the Edit and Comments actions

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Manage Annotations
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Manage Annotations
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