package com.choucair.tasks;

import com.choucair.ui.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    public Register(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public static Register withValidData(String firstName, String lastName, String email, String password) {
        return instrumented(Register.class, firstName, lastName, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.LINK_REGISTER),
                Click.on(RegistrationPage.RADIO_MALE),
                Enter.theValue(firstName).into(RegistrationPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(RegistrationPage.INPUT_LASTNAME),
                Enter.theValue(email).into(RegistrationPage.INPUT_EMAIL),
                Enter.theValue(password).into(RegistrationPage.INPUT_PASSWORD),
                Enter.theValue(password).into(RegistrationPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistrationPage.BTN_REGISTER)
        );
    }
}