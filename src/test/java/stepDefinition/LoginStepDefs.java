package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.SerenityHomeStep;
import serenity.SerenityLoginStep;

public class LoginStepDefs {
    @Steps
    private SerenityLoginStep loginPage;
    @Steps
    private SerenityHomeStep homePage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Assert.assertTrue(loginPage.isAtLoginPage());
    }

    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {
        loginPage.fillAccount(username, password);
    }

    @When("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String username, String password) {
        loginPage.fillAccount(username, password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user navigate to home page with a {string} greeting lable")
    public void user_navigate_to_home_page_with_a_greeting_lable(String greeting) {
        Assert.assertEquals(homePage.getLbGreeting(), greeting);
    }

    @Then("An {string} will be displayed")
    public void an_will_be_displayed(String errorMessage) {
        Assert.assertEquals(loginPage.getErrorMessage(), errorMessage);
    }

}
