package amazonTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by SOHAM on 07/06/2017.
 */
public class MyStepdefs {
    HomePage homePage = new HomePage();
    ProductInfoPage productDiscription = new ProductInfoPage();

    @Given("^I am on Home page of \"([^\"]*)\"$")
    public void iAmOnHomePageOf(String homePageName) throws Throwable {
        Assert.assertTrue(homePage.getPageTitle(homePageName));
    }

    @When("^I enter \"([^\"]*)\" into search product page$")
    public void iEnterIntoSearchProductPage(String product) throws Throwable {
        homePage.enter_Product_to_SearchBox(product);
    }

    @Then("^I should see page showing \"([^\"]*)\"$")
    public void iShouldSeePageShowing(String product) throws Throwable {
        System.out.println("===Search Page Info===");
        Assert.assertTrue(homePage.searchPageTextInfo(product));
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.searchResult_List_Info(product);
    }

    @And("^I select the \"([^\"]*)\"  and add product to Shopping cart$")
    public void iSelectTheAndAddProductToShoppingCart(String size) throws Throwable {
        System.out.println("=== Select Size and Add Product to Cart====");
        productDiscription.select_Size_Dropdown(size);
        productDiscription.addToCart();
    }


    @Then("^I can see \"([^\"]*)\" in shopping cart$")
    public void iCanSeeInShoppingCart(String product) throws Throwable {
        System.out.println("== " + product + " Added to Cart==");
        Assert.assertTrue(productDiscription.add_Confirmation("Added to Basket"));
    }


    @Then("^I click on Proceed to Checkout$")
    public void iClickOnProceedToCheckout() throws Throwable {
        productDiscription.click_ProceedButton();
    }


    @When("^I click Sign In Button and enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iClickSignInButtonAndEnterAnd(String email, String password) throws Throwable {
        System.out.println(email);
        System.out.println(password);
    }

    @Then("^I Click Submit for Login$")
    public void iClickSubmitForLogin() throws Throwable {
        System.out.println("Hi");
    }

    @Then("^I can see I am Logged in$")
    public void iCanSeeIAmLoggedIn() throws Throwable {
        System.out.println("Hi");
    }

    @Then("^I check the price of the \"([^\"]*)\"$")
    public void iCheckThePriceOfThe(String product) throws Throwable {

    }

    @And("^I check the price of the \"([^\"]*)\" in Shopping cart$")
    public void iCheckThePriceOfTheInShoppingCart(String product) throws Throwable {

    }

    @Then("^I check if the price is matching$")
    public void iCheckIfThePriceIsMatching() throws Throwable {

    }
}
