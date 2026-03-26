package com.choucair.tasks;

import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePayment implements Task {

    public static CompletePayment withVisaCard() {
        return instrumented(CompletePayment.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Visa").from(CheckoutPage.SELECT_CARD_TYPE),
                Enter.theValue("Barbara Gordon").into(CheckoutPage.INPUT_CARD_HOLDER),
                Enter.theValue("4485564059489345").into(CheckoutPage.INPUT_CARD_NUMBER),
                SelectFromOptions.byValue("4").from(CheckoutPage.SELECT_EXP_MONTH),
                SelectFromOptions.byValue("2039").from(CheckoutPage.SELECT_EXP_YEAR),
                Enter.theValue("123").into(CheckoutPage.INPUT_CARD_CODE),
                Click.on(CheckoutPage.BTN_CONTINUE_PAYMENT_INFO)
        );
    }
}