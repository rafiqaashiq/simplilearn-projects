Feature: Order Food

@TC_001 @order_food

Scenario: A user must be able to order a food on Swiggy

Given a user is on the landing page of Swiggy
When he type "Hyderabad" in the delivery location and then selects 1st option from the drop-down
And click on the first restaurant shown under Top restaurant chains in Hyderabad
And click on Add button corresponding to first listed dish
And hover over Cart in the top right corner
And click on Check Out in the sub-menu
And verify the text "To place your order now, log in to your existing account or sign up." is visible on the next page
