package com.choucair.tasks;

import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCreditCard implements Task {

    public static SelectCreditCard asPaymentMethod() {
        return instrumented(SelectCreditCard.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                WaitUntil.the(CheckoutPage.RADIO_CREDIT_CARD, isVisible())
                        .forNoMoreThan(15).seconds(),

                Click.on(CheckoutPage.RADIO_CREDIT_CARD),

                Click.on(CheckoutPage.BTN_CONTINUE_PAYMENT_METHOD)
        );
    }
}