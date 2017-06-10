Feature: Search Product and Add to the Shopping cart on Amazon
  I as user
  want to search Product
  and add to the shopping cart

  @test01
  Scenario Outline: I want to log In
    Given I am on Home page of "Amazon.co.uk"
    When I click Sign In Button and enter "<email>" and "<password>"
    Then I Click Submit for Login
    Then I can see I am Logged in
    Examples:
      | email            | password    |
      | sss@testmail.com | password123 |

  @test02
  Scenario Outline: Search the product
    Given I am on Home page of "Amazon.co.uk"
    When I enter "<product>" into search product page
    Then I should see page showing "<product>"
    And I select the "<Size>"  and add product to Shopping cart
    Then I can see "<product>" in shopping cart
    Then I click on Proceed to Checkout

    Examples:
      | product                                  | Size   |
      | Nike Men’s Air Max 90 Essential Trainers | 8 UK   |


   @test03
   Scenario Outline: March the price of the Product in Basket
     Given I am on Home page of "Amazon.co.uk"
     When I enter "<product>" into search product page
     Then I should see page showing "<product>"
     And I select the "<Size>"  and add product to Shopping cart
     Then I check the price of the "<product>"
     Then I can see "<product>" in shopping cart
     And I check the price of the "<product>" in Shopping cart
     Then I check if the price is matching
     Examples:
       | product                                  | Size   |
       | Nike Men’s Air Max 90 Essential Trainers | 8 UK   |


     #a[class='nav-logo-link'] span[class*='nav-logo-base']