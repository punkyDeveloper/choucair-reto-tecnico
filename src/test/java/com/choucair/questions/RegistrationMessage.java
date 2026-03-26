package com.choucair.questions;

import com.choucair.ui.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegistrationMessage implements Question<String> {

    public static RegistrationMessage displayed() {
        return new RegistrationMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegistrationPage.REGISTRATION_MESSAGE).answeredBy(actor);
    }
}