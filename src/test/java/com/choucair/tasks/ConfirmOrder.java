package com.choucair.tasks;

import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmOrder implements Task {

    public static ConfirmOrder onSummaryPage() {
        return instrumented(ConfirmOrder.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BTN_CONFIRM_ORDER)
        );
    }
}