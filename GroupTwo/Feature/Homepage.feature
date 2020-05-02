@Homepage
Feature: user should be able search items and check out

Scenario: To successfully search items 

When click on Dresses
And verify list of items shown on the page and print price for all the items
And select the second item from the list
And click on add to cart 
And verify the total price
Then close the checkout window and logouts