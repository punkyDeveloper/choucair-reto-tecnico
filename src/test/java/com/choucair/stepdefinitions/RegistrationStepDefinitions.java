package com.choucair.stepdefinitions;

import com.choucair.questions.RegistrationMessage;
import com.choucair.tasks.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RegistrationStepDefinitions {

    @Managed
    WebDriver driver;

    Actor user = Actor.named("User");

    @Given("the user navigates to the Demo Web Shop page")
    public void theUserNavigatesToThePage() {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(Open.url("https://demowebshop.tricentis.com/"));
    }

    @When("the user registers with valid data")
    public void theUserRegistersWithValidData() {
        user.attemptsTo(
                Register.withValidData(
                        "Santiago",
                        "Hernandez",
                        "santiago" + System.currentTimeMillis() + "@test.com",
                        "Test1234!"
                )
        );
    }

    @Then("the registration success message should contain {string}")
    public void theRegistrationMessageShouldContain(String expectedMessage) {
        user.should(
                seeThat(RegistrationMessage.displayed(), containsString(expectedMessage))
        );
    }
}