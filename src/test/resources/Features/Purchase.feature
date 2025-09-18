Feature: Purchase Item

  Scenario Outline: As a user i want to purchase an item
    Given I am in the login page
    When I enter a valid username "<username>" and a valid password "<password>"
    And I click on the login button
    Then I am logged in successfully
    When I add an item to the cart
    And click on the cart button
    Then I verify the item is in the cart
    When I click on the checkout button
    Then The your information page is displayed
    When I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I enter postal code "<postalcode>"
    And I clicks the continue button
    Then I should be navigated to the overview page
    And I verify that the items added to cart are still displayed
    And I verify that new total calculation is correct

    Examples:
      | username      | password     | firstname | lastname | postalcode |
      | standard_user | secret_sauce | Gift      | Motha    | 1984       |



