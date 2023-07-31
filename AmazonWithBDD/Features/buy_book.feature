Feature: Buy Book

@TC_001 @book_purchase
Scenario: A user must be able to buy a book on Amazon
Given a user is on the landing page of Amazon
When he type "physics books" in the search box and then select 3rd option from the drop-down
And select rating 4star and above from left side bar
And click on the first search result
And click Add to Cart button
And verify the text - "Added to Cart" is displayed
And click on Proceed to Buy button
And he verify user is on the Sign in page