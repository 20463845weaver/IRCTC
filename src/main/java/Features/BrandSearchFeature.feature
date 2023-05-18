Feature: Searching brand names

@Brands
Senario: Search Valid Brand Name
Given I Launched the application
When I Hovered over the brand tab
When I searched for a valid Brand name
Then I Verified that brand name got searched sucessfully


@ABC
Senario: ABC
Given I an "Person1"
When I do a
Then I get C