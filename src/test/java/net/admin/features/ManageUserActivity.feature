Feature: Validate Admin - Manage User Activity

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "**********"
Then user is to click the button "SUBMIT"
Then user is to click the "Manage User Activity"

Scenario: From Date and To Date Textboxes verification
And user is to click the From Date Textbox
And user is to clear the From Date Textbox
And user is to click the To Date Textbox
And user is to clear the To Date Textbox

Scenario: Calendar Popup Menu verification
And user is to click the year on the From Date textbox calender menu
And user is to select a year on the From Date textbox calendar menu
And user is to select a month on the From Date textbox calendar menu
And user is to click the next arrow on the From Date textbox calendar menu
And user is to click the previous arrow on the From Date textbox calendar menu
And user is to select a date on the From Date textbox calendar menu
And user is to click the year on the To Date textbox calender menu
And user is to select a year on the To Date textbox calendar menu
And user is to select a month on the To Date textbox calendar menu
And user is to click the next arrow on the To Date textbox calendar menu
And user is to click the previous arrow on the To Date textbox calendar menu
And user is to select a date on the To Date textbox calendar menu
And user is to click the checkmark button

Scenario: Search Textbox verification using Page name
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the page name in the search textbox
And user is to verify the User activities related to page name

Scenario: Search Textbox verification using User name
And user is to click the search textbox
And user is to clear the search textbox
And user is to enter the user name in the search textbox
And user is to verify the User activities related to user name

Scenario: Dropdown Entries and Print button verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list
And user is to verify the Print button

Scenario: Filter icon button verification
And user is to click the Filter icon button
And user is to click the Document Access History action
And user is to click the Filter icon button
And user is to click the Search History action
And user is to click the Filter icon button
And user is to click the User Accounts action
And user is to click the Filter icon button
And user is to click the All action

Scenario: Sorting icons and Next & Previous buttons verification
And user is to click the Sorting icons
And user is to click the Next button
And user is to click the Previous button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Manage User Activity
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Manage User Activity
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