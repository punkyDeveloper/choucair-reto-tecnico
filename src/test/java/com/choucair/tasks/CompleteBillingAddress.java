package com.choucair.tasks;

import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil; // Importante
import net.serenitybdd.screenplay.conditions.Check;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteBillingAddress implements Task {

    public static CompleteBillingAddress withDeliveryData() {
        return instrumented(CompleteBillingAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        if (!CheckoutPage.SELECT_BILLING_ADDRESS.resolveAllFor(actor).isEmpty()) {
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText("New Address")
                            .from(CheckoutPage.SELECT_BILLING_ADDRESS)
            );
        }


        actor.attemptsTo(


                WaitUntil.the(CheckoutPage.BILLING_FORM, isVisible()).forNoMoreThan(15).seconds(),

                Enter.theValue("Jose").into(CheckoutPage.INPUT_FIRSTNAME),
                Enter.theValue("Arturo").into(CheckoutPage.INPUT_LASTNAME),
                Enter.theValue("joseArt@gmail.com").into(CheckoutPage.INPUT_EMAIL),

                SelectFromOptions.byVisibleText("Colombia").from(CheckoutPage.SELECT_COUNTRY),

                Enter.theValue("Medellin").into(CheckoutPage.INPUT_CITY),
                Enter.theValue("calle 14 6-51").into(CheckoutPage.INPUT_ADDRESS1),
                Enter.theValue("12315").into(CheckoutPage.INPUT_ZIPCODE),
                Enter.theValue("3177777777").into(CheckoutPage.INPUT_PHONE),


                Click.on(CheckoutPage.BTN_CONTINUE_BILLING),


                WaitUntil.the(CheckoutPage.BTN_CONTINUE_SHIPPING, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutPage.BTN_CONTINUE_SHIPPING),


                WaitUntil.the(CheckoutPage.BTN_CONTINUE_SHIPPING_METHOD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutPage.BTN_CONTINUE_SHIPPING_METHOD)

        );
    }
}