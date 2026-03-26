package com.choucair.stepdefinitions;

import com.choucair.questions.OrderMessage;
import com.choucair.tasks.*;
import io.cucumber.java.en.And;
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

public class PurchaseStepDefinitions {

    @Managed
    WebDriver driver;

    Actor user = Actor.named("Buyer");

    @Given("the user logs in with valid credentials")
    public void theUserLogsIn() {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(Open.url("https://demowebshop.tricentis.com/"));
        user.attemptsTo(Login.withCredentials("santiago@test.com", "Test1234!"));
    }

    @When("the user navigates to Computers and Desktops subcategory")
    public void theUserNavigatesToDesktops() {
    }

    @And("adds the first available product to the cart")
    public void addsProductToCart() {
        user.attemptsTo(AddProductToCart.fromDesktops());
    }

    @And("proceeds to checkout with delivery data")
    public void proceedsToCheckout() {
        user.attemptsTo(ProceedToCheckout.fromCart());
        user.attemptsTo(CompleteBillingAddress.withDeliveryData());
    }

    @And("selects credit card as payment method")
    public void selectsCreditCard() {
        user.attemptsTo(SelectCreditCard.asPaymentMethod());
    }

    @And("completes the credit card information")
    public void completesCreditCardInfo() {
        user.attemptsTo(CompletePayment.withVisaCard());
    }

    @And("confirms the order")
    public void confirmsTheOrder() {
        user.attemptsTo(ConfirmOrder.onSummaryPage());
    }

    @Then("the confirmation message should contain {string}")
    public void theConfirmationMessageShouldContain(String expectedMessage) {
        user.should(
                seeThat(OrderMessage.displayed(), containsString(expectedMessage))
        );
    }
}