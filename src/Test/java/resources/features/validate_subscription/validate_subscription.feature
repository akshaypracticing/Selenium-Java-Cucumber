Feature: As a user I should be able to navigate through of STCTV site's URL and check packages for all the available countries

  Scenario Outline: Validating different packages available for each country after going to subscribe URL
    Given I am on the Subscribe page URL "https://subscribe.stctv.com/"
    When I click on English button to select it as language for further validations
    Then I should see Subscription page for <country>
    Then I validate <package>
		
 	Examples:
	 | country | package |
	 | KSA     | LITE    |
	 | KSA     | CLASSIC |
	 | KSA	   | PREMIUM |
	 | Bahrain | LITE    |
	 | Bahrain | CLASSIC |
	 | Bahrain | PREMIUM |
	 | Kuwait  | LITE    |
	 | Kuwait  | CLASSIC |
	 | Kuwait  | PREMIUM |
  
   
