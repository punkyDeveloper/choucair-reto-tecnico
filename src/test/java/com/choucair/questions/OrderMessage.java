package com.choucair.questions;

import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OrderMessage implements Question<String> {

    public static OrderMessage displayed() {
        return new OrderMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckoutPage.ORDER_SUCCESS_MESSAGE).answeredBy(actor);
    }
}