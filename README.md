# vacaytoday

## Table of Contents
1. [Overview](#Overview)
2. [Product Spec](#Product-Spec)
4. [UI Design](#UI-Design)
5. [Schema Design](#Schema-Design)
6. [APIs](#APIs)

## Overview
### Description
Vacaytoday is a cross-platform mobile application that provides travel planning and managing features. Your friends can get access to the shared trips and update travel details day by day with core functionalities such as:
* Create trips and activities for every trip
* View filtered and sorted activities by date and time
* Add activity descriptions
* Add and save pictures
* Record expenses within every trip
* Categorize each activity by adding tags

In addition, Vacaytoday users can share their own travel plans and view other users' public plans to favorite, comment and save to get more travel ideas! 

### App Evaluation
- **Category:** Travel, Social
- **Motivation:**  The hassle of managing travel plans on spreadsheets makes travel planning seem like work. Quick, easy access and updates to your plans in a modular way while traveling keeps everyone on the trips on the same page and keeps your travel memories fresh. Planning new trips will be more fun and efficient when you can refer to and tailor other's travel ideas and stories to your very own trips.
- **Market (US and Vietnam only):** 
	- GenZs who love to share their traveling experiences
	- Family/group of friends who need a way to keep track of travel planning
- **Habit:** Average users would both create and consume
- **Scope:** The stripped-down version of this app would include creating travel plans, publishing travel plans and explore those of other users.

### Technology

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* *Authentication*
	* [ ] User can create an account using email or phone number with OTP code verification
	* [ ] User can log in using email or phone number with OTP code verification
	* [ ] User can log out
	* [ ] When opening the app and not logged in, user must log in or create an account to proceed
	* [ ] When opening the app and logged in, user can proceed
	* [ ] When logged in, user can leave the app and have their account persisted until they log out
	* [ ] User can log in on multiple devices at the same time
	
* *Account & User*
	* [ ] User can view all their profile information
	* [ ] User can optionally upload, remove and edit their profile picture
	* [ ] User can edit their display name, but can't leave it empty
	* [ ] User can optionally add and edit their bio description
	* [ ] When logged in with email, user can optionally add a phone number with OTP code verification
	* [ ] When logged in with phone number, user can optionally add an email with OTP code verification
	
* *Trip-level Management*
	* [ ] User can view and add trips
	* [ ] When user is the owner/creator of a trip, user can remove the trip
	* [ ] When user is the owner/creator of a trip, user can invite other users to view and modify a trip, its associated activities, and expenses
	* [ ] When user is the owner/creator of a trip, user can remove other users from viewing and modifying the trip
	* [ ]  When user is inviting other users to a trip, user can only add the invitees that have already had app accounts
	* [ ] When user is inviting other users to a trip, user can add the invitee's private unique code
	* [ ] When an invitee is invited to a trip, invitee can view and access the trip
	* [ ] Invitee can choose to be removed from a shared trip
	* [ ] User can order trips by dragging and dropping
	* [ ] User can edit trip-level information, such as 
		* Trip title
		* Start and end dates
		* Locations (cities and countries)
		* Trip overview
	* [ ] When user adds locations, user can select from a default dropdown list of cities & countries
	* [ ] User can upload and view uploaded pictures within a trip 
	* [ ] User can access and view a list of expenses associated to a specific trip
	* [ ] User can add, remove and edit expense details that they own, not others' expenses, such as 
		* Expense title
		* $ amount
		* Expense owner's name
		* Expense date
		* Description/note
	* [ ] When one user is modifying a trip-level field, other users who are in the trip cannot modify that the section where that field belongs to concurrently
	* [ ] When one user is modifying a trip-level section, other users can see that current status
	* [ ] User can view the total expense in a trip

* *Activity-level Management*
	* [ ] User can tap on a trip to access the activities associated to that trip
	* [ ] User can view the activities in a chronological order of a default date, which is the date closest to the current date
	* [ ] User can choose to view activities of other dates by selecting from a collapsable/expandable dropdown list
	* [ ] User can view activities of multiple dates at the same time
	* [ ] User can add, remove and edit activities within a trip
	* [ ] User can enter activity information, such as 
		* Activity title
		* Date
		* Time from and time to
		* Category tags
		* Description/notes
	* [ ] When user add tags, user can view a few default tag suggestions, such as "restaurant," "hotel," "flight," etc., and choose to add to the activity
	* [ ] User can create and add custom tags to an activity
	* [ ] User can edit tag title and tag color
	* [ ] User can view and select from the tags that were created within the trip
	* [ ] User can upload and view uploaded pictures within an activity
	* [ ] User can choose to view filtered activities by selecting multiple category tags independent of dates
	* [ ] When one user is modifying an activity, other users who are in the trip cannot modify that activity concurrently
	* [ ] When one user is modifying an activity, other users can see that current status

* *Publishing Trips*
	* [ ] When user is the owner/creator of a trip, user can publish and un-publish the trip
	* [ ] When a trip is published, user cannot modify the trip and associated activities; vice versa, user can only modify the trip when it is not published
	* [ ] When user publish a trip, user can choose to hide and unhide certain activities, expenses, and certain pictures
	* [ ] User can view all comments and the number of saves, likes and comments on their published trips

* *Explore Published Trips*
	* [ ] User can scroll infinitely to view published trips and their basic info such as
		*  Thumbnail
		* Trip title
		* Locations (cities and countries)
	* [ ] User can view filtered published trips by typing in keywords that might be locations or in trip titles
	* [ ] User can view sorted published trips by number of likes
	* [ ] When user view published trips, user can apply each or both filter and sort functions
	* [ ] When tap on a published trip, user can view info such as 
		* Trip-level pictures
		* Trip title
		* Trip owner's profile picture and display name
		* Duration
		* Start date and end date
		* Trip overview
		* Total and itemized expenses
		* Locations (cities and countries)
		* Activities (details and activity-level pictures)
	* [ ] User can view the activities in a chronological order of a default date, which is the oldest date on the trip
	* [ ] User can choose to view activities of other dates by selecting from a collapsable/expandable dropdown list
	* [ ] User can view activities of multiple dates at the same time
	* [ ] User can choose to view filtered activities by selecting multiple category tags independent of dates
	* [ ] User can save and un-save a published trip of their favorite
	* [ ] User can view saved trips
	* [ ] User can like and unlike a published trip
	* [ ] User can add, edit and remove a comment they author on a published trip

**Optional Nice-to-have Stories**

* *Authentication*
* *Account & User*
	* [ ] User can turn on and off notifications from the app regarding upcoming activity, new likes, new comments, etc.
* *Trip-level Management*
	* [ ] User can see the owner of a trip
	* [ ] User can view who was the last to modify a trip-level section
* *Activity-level Management*
	* [ ] User can view who was the last to modify an activity
	* [ ] When user enter an address or place, user can be directed to Google Map to locate it
* *Publishing Trips*
* *Explore Published Trips*
	* [ ] User can view other users' profiles and info 
  

## UI Design

  [Figma design](https://www.figma.com/file/D2WD0ijymHHuEl3uZVu7mL/vacaytoday?type=design&node-id=0-1&t=jKBGymGWwZtlwjX6-0)

## Schema Design

  [Miro board](https://miro.com/app/board/uXjVMUNyf0s=/?share_link_id=668609482051)

## APIs

  Under development
