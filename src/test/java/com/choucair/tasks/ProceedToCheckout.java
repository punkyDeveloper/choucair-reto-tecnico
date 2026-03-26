package com.choucair.tasks;

import com.choucair.ui.ProductPage;
import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProceedToCheckout implements Task {

    public static ProceedToCheckout fromCart() {
        return instrumented(ProceedToCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.LINK_SHOPPING_CART),
                Click.on(ProductPage.CHECKBOX_TERMS),
                Click.on(ProductPage.BTN_CHECKOUT),
                Click.on(CheckoutPage.BTN_CHECKOUT_AS_GUEST)
        );
    }
}