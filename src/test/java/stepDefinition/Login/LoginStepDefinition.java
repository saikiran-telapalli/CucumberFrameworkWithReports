package stepDefinition.Login;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    LoginSteps loginSteps = new LoginSteps();

    @Given("navigate to url {string}")
    public void navigate_to_url(String url) throws Throwable {
        loginSteps.navigate(url);
    }

    @When("^Login to app$")
    public void open_browser() throws Throwable {
        loginSteps.logIn();
    }

    @Then("^verify title$")
    public void verify_title() throws Throwable {
        loginSteps.getTitle();
    }

}
