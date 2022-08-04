Feature: Validate Admin - Backup & Restore Data

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "*************"
Then user is to enter password as "*********"
Then user is to click the button "SUBMIT"
Then user is to click the "Backup&RestoreData"

Scenario: Backup & Restore buttons verification
And user is to verify the Backup Now button
And user is to verify the Restore Now button

Scenario: Last Backup Status verification
And user is to verify the Start Time in Last Backup Status
And user is to verify the End Time in Last Backup Status
And user is to verify the Status in Last Backup Status

Scenario: Last Restoration Status verification
And user is to verify the Start Time in Last Restoration Status
And user is to verify the End Time in Last Restoration Status
And user is to verify the Last Restored File Name in Last Restoration Status
And user is to verify the Status in Last Restoration Status

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Backup & Restore Data
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the Backup & Restore Data
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