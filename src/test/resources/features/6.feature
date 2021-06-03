@GuestCheckoutLogin
Scenario: Unauthorized user logins when in checkout
Given User add a product to cart
Then preses checkout
And User logins on checkout page
Then Billing address press continue
And Delivery details press continue
Then Delivery method press continue
And checks terms and presses continue
And User presses confirm order
Then User is on success page