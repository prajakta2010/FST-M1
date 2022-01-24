@activity1_3
Feature: Testing with Tags

@SimpleAlert @SmokeTest
Scenario: Testing with Simple Alert
					Given User is on Alert page
					When User clicks the Simple Alert button
					Then Alert opens
					And Read the text from it and print it
					And Close the alert
					And Close the Browser
					
@ConfirmAlert				
Scenario: Testing with Confirm Alert			
					Given User is on Alert page
					When User clicks the Confirm Alert button
					And Alert opens
					And Read the text from it and print it
					And Close the alert with Cancel
					And Close the Browser
					
@PromptAlert 					
Scenario: Testing with Prompt Alert		
					Given User is on Alert page
					When User clicks the Prompt Alert button
					Then Alert opens
					And Read the text from it and print it
					And Write a custom message in it
					And  Close the alert
					And Close the Browser